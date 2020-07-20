// ==UserScript==
// @name                [絕]天猫
// @author              絕版大叔丶
// @namespace           http://hxun.vip
// @match               *://*.tmall.com/*
// @match               *://*.taobao.com/*
// @grant               GM_getValue
// @grant               GM_setValue
// @grant               GM_addStyle
// @updateURL           http://localhost:8000/taobao.user.js
// @downloadURL         http://localhost:8000/taobao.user.js
// @version             1.3
// @author              -
// @description         test
// @description:zh-CN   测试用
// @compatible          chrome   测试通过
// 该脚本将仅在顶级文档中执行，而不在嵌套框架中执行。
// @noframes
// 脚本在DOMContentLoaded被触发时执行。目前，页面的基本HTML已准备就绪，其他资源（如图片）可能仍在使用中。
// 默认 document-end
// @run-at              document-end
// ==/UserScript==

// CDN
// https://www.bootcdn.cn/jquery/
// https://cdnjs.loli.net/ajax/libs/jquery/3.5.1/



取材质 = async (url) => {
    const data = await fetch(url, {
        mode: "no-cors",
        headers: {
            "cache-control": "no-cache",
            "cookie": "SameSite=Lax;",
        }
    })
    return await data.text()
}

let css = `
#item {
    position:fixed;
    left:10px;
    top:10px;

    padding: 20px;

    z-index: 999999999;

    background-image: url(http://localhost:8000/h.jpg);
    background-size: cover;
    background-repeat: no-repeat;
    box-shadow: 0 0 6px 2px black;
}


#item ul {
    display: flex;
    flex-direction: column;
    align-content: space-around;

    min-height: 51vh;
    padding: 10px;
    z-index: 1;

    color: #6eff00fc;
    background-color: rgba(0,0,0,0.3);
    box-shadow: 0 0 7px 1px black;
    transform: translate(0, 0);
}

#item ul:before {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;

    z-index: -1;
    
    background-image:url("http://localhost:8000/xsp.jpg");
    background-size: cover;
    background-repeat: no-repeat;
    background-color: rgba(255,255,255,0.8);

    filter: blur(2px);
}


#item li {
    height:20px;
}
`;

css = `
#item {
    z-index: 99999;
    /* margin: 6px; */
    padding: 0;
    margin: 0;
    position: fixed;
    left: 30px;
    top: 30px;
    /* width: 20vw; */
    /*height: 70vh;*/
    /* background-color: rgb(255 160 52); */
    background-color: rgb(255 120 216);
    background-image: url(8sl.jpg);
    /* background-size: contain; */
    /* background-repeat: no-repeat; */
    box-sizing: border-box;
    
    font-size: x-large;
    font-family:"Microsoft YaHei";
    color: white;
    text-shadow: 1px 1px 0 #000,-1px -1px 0 #000,-1px 1px 0 #000,1px -1px 0 #000;
}

#item ul {
    /* display: flex;
    flex-direction: column;
    align-content: space-around; */
    padding: 18px;
    margin: 0;
    z-index: 1;
    /* padding: 20px; */
    box-shadow: 0 0 6px 2px black;
    transform: translate(0, 0);
    list-style-type: none;
    box-sizing: border-box;
}

#item ul:before {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    /* background-image: url(h.jpg); */
    background-size: cover;
    /* filter: blur(2px); */
    z-index: -1;
    box-shadow: 0 0 6px 2px black;
    box-sizing: border-box;
    background-image:url("http://localhost:8000/xsp.jpg");
    background-size: cover;
    background-repeat: no-repeat;
    background-position: center;
    opacity: 0.7;
}
`;



/*
right: 0;
        bottom: 0;
    
        height:20px;
        width:100px;
    
        margin:10px;
        padding:10px;
    
        width: auto;
        justify-content: center;
        align-items: center;
    justify-content     x轴
    align-items         Y轴
    flex-direction      排列方式    主轴(main-axis)的方向
    flex-wrap
    
    */

// 添加 css 样式
// GM_addStyle(css)

// document.styleSheets[0].insertRule(css)
// 直接修改样式表
// document.styleSheets[0].ownerNode.innerHTML=css


/**
 * 修复console.log
 * 新增 console.log 别名函数 echo 或 printf
 */
(修复log = () => {
    var iframe = document.createElement('iframe')
    document.body.appendChild(iframe)
    window.console = iframe.contentWindow.console
    window.printf = window.echo = console.log
})()

const 取商品信息 = (选择器, el) => {
    item = {}
    const 过滤器 = {
        品牌: Symbol(),
        材质: Symbol(),
        销售渠道类型: Symbol(),
        大身材质成分: Symbol(),
        裆部材质成分: Symbol(),
        材质成分: Symbol(),
        上市年份季节: Symbol(),
        厚薄: Symbol(),
        面料: Symbol(),
    }

    const 关键字 = {
        差: { msg: "可能是垃圾", reg: ["聚酯", "涤纶", "聚酰胺", "锦纶"], css: `<li style="color:#ff0000;">` },
        优: { msg: "可能是良品", reg: ["棉", "麻", "丝"], css: `<li style="color:#00ff00;">` },
    }



    // 商品信息生成对象
    for (const { innerText, title } of $(选择器, el)) {
        const name = /.*(?=:)/.exec(innerText)[0]
        item[name] = title
    }
    // 过滤信息 并生成dom模板
    let dom = ""
    // 由于对象无法正常遍历 需要先转换
    for (const v of Object.entries(item)) {
        // 判断 v 是否过滤器的存在的属性名称
        if (过滤器?.[v[0]]) {
            let li = `<li>${v.join(":")}</li>`
            for (const v of Object.entries(关键字)) {
                // printf(v, 111111111)
                // v[1].includes("聚酰胺")

            }
            // 小提示 给垃圾产品 注释
            // 棉纶 尼龙
            // 涤纶 的确良
            // if (v[1].includes("涤纶") || v[1].includes("聚酰胺") || v[1].includes("锦纶")) {
            //     li = `<li style="color:#ff0000;">${v.join(":")}  可能是垃圾货</li>`
            // }
            // // 优质
            // if (v[1].includes("棉") || v[1].includes("麻") || v[1].includes("丝")) {
            //     li = `<li style="color:#00ff00;">${v.join(":")}  可能是良品</li>`
            // }

            // dom += li
            // printf(v)
        }
    }

    // 加入页面  内联置顶
    $(`<div id="item" style="z-index: 999999999;"><ul>${dom}</ul></div>`).appendTo("body")


    printf(2222222, item)
    printf(333333, dom)
}


const 取源码 = async (url) => {
    printf(2222222222222222222, url)
    try {
        const response = await fetch(url)
        printf(url, 1111111111, response)
        const source = await response.text()
        const el = createElement("html")
        el.innerHTML = source
        return el
    } catch (error) {
        // 错误处理
        throw new Error("读取源码失败", error)
    }

}

const 获取所有商品 = async () => {
    let dom = null

    // 手动延迟 直到元素出现
    while (true) {
        await 延时(500)
        dom = $(".comboHd")
        if (dom.length) {
            break
        }
    }

    // 删除所有推荐物品
    dom.nextAll().remove();

    let num = 0
    const promises = []

    // 获得所有商品
    for (const { href } of $("dt a.J_TGoldData")) {
        // 立刻触发访问
        promises.push(取源码(href))
        // 5次中断一次
        if (!(num++ % 5)) {
            try {
                for (const promise of promises) {
                    await promise
                }
            } catch (error) {
                console.error("商品获取失败:", error)
                break
            }
            break
        }
        printf(num, 33333333333)

    }

    // for (const promise of promises) {
    //     const el = await promise
    //     printf(el.href)

    // }
    printf(await promises, 666666666666)



}




const 延时 = (t = 2000) => new Promise((resolve) => {
    setTimeout(resolve, t)
})



// 消除 if
const 反射 = (v) => {
    printf("域：", v)
    const fun = /\S+?(?=\.)/.exec(v)[0]
    printf(fun, 11111, "A." + fun + "()")
    eval("A." + fun + "()")
}

// 商店页面
const semiroutlets = () => {
    // 跨域问题
    获取所有商品()
}


class A {
    // 天猫 商品页面
    static detail() {
        取商品信息("#J_AttrUL li")
    }

    // 淘宝 商品页面
    static item() {
        取商品信息(".attributes-list li")
    }
}





const info = {
    完整地址: location.href,
    主机地址: location.hostname
};

(async () => {
    // 动态加载JQ
    await import("https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js")
    $ = window?.jQuery ?? window?.$ ?? window.$$

    // 本地测试用
    if (info.主机地址 == "localhost") {
        取商品信息("#J_AttrUL li")
        return
    }
    // 添加css列表
    $("<style>").text(css).appendTo($("head"));
    // 在开头插入 让其优先度下降  如果没尖括号会取原有的标签 造成替换效果
    // $("head").prepend($("<style>").text(css));

    反射(info.主机地址)

})()