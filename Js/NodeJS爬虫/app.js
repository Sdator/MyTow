const fetch = require('node-fetch');
const $ = cheerio = require('cheerio');
const fs = require('fs');

const http = require('http')
class WebServer {
    init() {
        const server = http.createServer(function (req, res) {
            res.writeHead(200, { 'Content-Type': 'text/html;charset=UTF-8' });
            res.end('TEST')
        })
        server.listen(3000, "localhost")
    }
}

/**
 * 动态加载
 */
async function reload(url = "http://localhost:8000/chobit.cc.user.js") {
    await import(url + "?t=" + Math.random())
}

function 延迟(time = 500) {
    return new Promise((resolve) => {
        setTimeout(resolve, time)
    })
}

// 总结：匿名函数的最主要作用是创建闭包，闭包就是将函数内部和函数外部连接起来的一座桥梁。
// 内层的函数可以使用外层函数的所有变量，即使外层函数已经执行完毕。闭包可以用来模仿块级作用域等等。


/**
 * 无限遍历器
 * 1. 可无限生成自然数
 * 2. 类似无限循环的作用
 * 3. 实现了 Symbol.iterator 属性即可遍历
 * @param {Number} strat 起始数值 默认为0
 */
function 无限递增器(strat = 0) {
    return {
        [Symbol.iterator]: function () {
            let i = strat;
            return {
                next: function () {
                    return { value: i++, done: false }
                }
            }
        }
    }
}


function 递增器Ex() {
    let i = 0;
    return () => i++
}


function 限定递增器(str = 0, end = 5) {
    return {
        [Symbol.iterator]: function () {
            let i = str;
            return {
                next: function () {
                    i = i < end ? i : str
                    return { value: i++, done: false }
                }
            }
        }
    }
}



class A {

    // 读取本地数据 首次执行没有 需要初始化


    constructor() {
        // 把旧的类保存起来
        // 如果本地没有 2D 这条数据 使用空对象代替
        let json = ""
        try {
            json = fs.readFileSync('data.json')
        } catch (error) {
            json = '{"2D":{}}'
        }
        this.oldA = JSON.parse(json);
        this.当前进度 = this.oldA?.进度 ?? 1

    }


    /**
     * 用于读取网站返回数据并转为 text 文本，存进虚拟dom中用于后续处理
     * @param {string} url  要读取的网址
     */
    async 取源码(url) {
        // 1 读取网站源码 如果请求状态不是200-299 抛出异常并输出
        // 设置不跨域 减少报错
        const rec = await fetch(url, { mode: 'no-cors' })
        if (!rec.ok)
            throw new Error("取源码失败：" + rec.statusText)
        return await rec.text()
    }


    async Get特定页视频(url) {
        echo(url, "读取中...")
        // 做一个错误处理 成功或失败访问记录到数组中
        try {
            const el = await this.取源码(url)
            // 读取视频源
            const arr = $$("source", el)
            let max = 0
            let 下载地址 = ""
            // 取质量最高的视频下载链接
            for (let { src, dataset: { width } } of arr) {
                // 转数值类型  因为字符串无法运算
                let num = Number(width)
                if (num > max) {
                    max = num
                    下载地址 = src
                }
            }
            let 标题 = $$(".work-name h1", el)[0].innerText
            return { 标题, 下载地址 }

        } catch (err) {

            console.error("商品获取失败:", url, err)
        }
    }
    /**
     *
     * @param {string} url 要获取源码的页面地址
     */
    async Get取页面商品(url) {
        echo("读取所有商品...")
        let body = await this.取源码(url)
        // 文本解析为html对象
        const dom = $.parseHTML(body)
        // 判断是否最后一页
        // 读取当前页所有商品连接 并
        const els = $$(".work-box.big-image-type", dom)


        // 没有读取到 抛出错误并返回
        if (!els.length) {
            throw new Error("没有商品了")
        }
        // 返回一个包含所有商品名称和链接的 数组对象
        // map 默认返回 JQ 节点对象 需要转换为可遍历数组
        const arr = []
        els.each((v, k) => {
            const 日期 = $(".work-point", k).text()
            const 名称 = $(".work-work-name", k).text()
            const 简介 = $(".work-intro", k).text()
            const 分类 = $(".work-category", k).text()
            const 连接 = $(".work-work-name a", k).attr("href")
            const 封面 = $(".work-main-thumb img", k).attr("src")
            arr[连接] = { 日期, 名称, 简介, 分类, 封面 }
        })
        // els.map((_, { attribs: { href: 连接 }, children: [{ data: 名字 }] }) => {
        //     arr[连接] = { 名字 }
        // })

        // els.map((_, v) => {
        //     echo(v)
        // })


        // Array.from(els.map((_, { attribs: { href: 连接 }, children: [{ data: 名字 }] }) => ({ [连接]: { 名字 } })))
        return arr
    }


    /**
     * 获取所有页面的视频地址
     */
    async 收集网页() {
        // 用于存放 异步 返回数据
        const data = []
        const 步进 = 1
        // 修改开始数值 不用老+1
        for (const page of 无限递增器(1)) {
            // 直接触发异步访问 把异步结果放到 data数组中
            data.push(this.Get取页面商品(`https://chobit.cc/s?f_category=vd_2d&s_page=${page}`))

            this.当前进度 = page
            // 测试限制用
            print("page 当前进度", page)

            // 当页数是 步进 的倍数时候  就中断一次
            if (!(page % 步进)) {
                try {
                    // 暂停主线程等待异步结果再继续下一次访问连接
                    // 触发所有异步同时进行
                    console.time("中断等待结果");
                    // await Promise.all(data)
                    for (const v of data) {
                        await v
                    }
                    console.timeEnd("中断等待结果");
                } catch (error) {
                    console.error("没有了")
                    break
                }
            }
        }
        echo(2222222)
        try {
            for (const v of data) {
                const x = await v
                // 合并对象 自动覆盖旧的
                Object.assign(this.oldA['2D'], x)
            }
        } catch (error) {

        }

        let json = JSON.stringify(this.oldA)
        fs.writeFileSync('data.json', json);
    }
};

const $$ = $;
const GetType = Object.prototype.toString;
const echo = print = console.log;

/**
 *  自运行异步fun
 */
(main = async () => {

    // // 改为全局变量用于测试
    const a = new A()

    Array.from(a.oldA['2D'])
    for (const [k, v] of Object.entries(a.oldA['2D'])) {
        echo(k)
    }


    // }

    // try {
    //     const data = await a.收集网页()

    // } catch (error) {
    //     echo(123)
    // }



}
)()
