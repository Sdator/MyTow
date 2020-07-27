// ==UserScript==
// @name                [絕]机战
// @author              絕版大叔丶
// @namespace           https://sdator.github.io/
// @icon
// @version             1.2
// @match               *://down.99.com/*
// @description         机战获取各版本号
// @grant               GM_addStyle
// @require             https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js
// ==/UserScript==


let css = `
body {
    display: flex;
    background-color: bisque;
    justify-content: center;
    align-items: center;
}

#diy {
    margin: 50px;
    width: 70vw;
}
`;

//css样式
// GM_addStyle(css)

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
            return { next() { return { value: i++, done: false } } }
        }
    }
}

const GetType = Object.prototype.toString


class A {

    data = []

    async 取源码(url) {
        // 1 读取网站源码 如果请求状态不是200-299 抛出异常并输出
        // 设置不跨域 减少报错
        // 允许重定向
        // 发送 cookies
        // 不带源网
        const rec = await fetch(url, { mode: 'no-cors', redirect: 'follow', credentials: 'include', referrer: 'no-referrer' })

        // console.log(rec, url, 99999999999);
        if (!rec.ok) {
            throw new Error(rec.statusText)
        }
        const body = await rec.text()
        // 2 使用虚拟dom包装源码 用于后续解析
        // const el = document.createElement('html')
        // el.innerHTML = body
        // 用JQ把字符串生成一个对象
        return $.parseHTML(body)

    }
    async 取相关信息(url) {
        const data = await this.取源码(url)
        const dom = $(data).find(".type_twlist.type_twlist3.cn_mgbtm10 h4")
        for (const el of dom) {
            // console.log(typeof el, await el);
            // const el = $(await dom)
            const 名字 = $(el).find("a.c_black").text()
            const 日期 = $(el).find("span.fs_12.fw_n.c_grey").text()
            // 关键字过滤
            if (!名字.includes("更新包")) continue
            this.data.push({ 名字, 日期 })
            console.log({ 名字, 日期 }, 222222222);
        }
    }

    async 搜索() {
        const data = []
        for (const num of 无限递增器(1)) {
            const url = `https://down.99.com/html/list/21/list_addtime_${num}.shtml`
            data.push(this.取相关信息(url))
            console.log("当前进度:" + num);

            if (!(num % 5)) {
                try {
                    for (const el of data) {
                        await el
                    }
                    // 每循环一次 保存数据到本地
                    localStorage['数据'] = JSON.stringify(this.data)

                } catch (error) {
                    console.log("读取源码失败跳出循环：" + error);
                    // data.pop()
                    break
                }
            }
        }
    }
}

/**
 * 动态加载
 */
reload = async (url = "http://localhost:8000/游戏/机战.user.js") => {
    await import(url + "?t=" + Math.random())
}



(async () => {

    // 重建主题
    $('<input/>', {
        type: "button",
        value: "测试",
        id: "MyButton",
        click() {
            const a = new A();
            a.搜索()
            // reload()
        },
        css: {
            "height": "50px",
            "width": "100px",
            "background-color": "bisque",
            "position": "fixed",
            "left": "10px",
            "top": "10px",
            "z-index": 999999999,
        },
    }).appendTo("body");

    // 按钮滚随滚动
    // 使用绝对定位 absolute 解决 position:fixed;  带来的问题 Stacking Context -- 堆叠上下文
    // 简单的说就是 position:fixed 相对窗口定位 有可能会因为父元素设置了 transform 属性导致效果没有达到预想的那样
    // 设置了 transform 属性 会使元素相对于窗口 变为相对于 父元素
    // 当然只要保证不设置 transform 就不需要啦
    // $(this).scroll(() => {
    //     $("#MyButton").css("top", $(this).scrollTop() + 30)
    // })


})()
