// ==UserScript==
// @name                [絕]天猫
// @author              絕版大叔丶
// @namespace           http://hxun.vip
// @match               *://*.tmall.com/*
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
// @noframes
// 页面加载结束后运行
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
   

    z-index: 99999;

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
    
    background-image:url("http://localhost:8000/h.jpg");
    background-size: cover;
    background-repeat: no-repeat;
    background-color: rgba(255,255,255,0.8);

    filter: blur(2px);
}


#item li {
    height:20px;
}
`


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






列出基本信息 = () => {
    item = {}
    const 过滤器 = {
        品牌: Symbol(),
        材质: Symbol(),
        销售渠道类型: Symbol(),
        大身材质成分: Symbol(),
        裆部材质成分: Symbol(),
        材质成分: Symbol(),
        上市年份季节: Symbol(),
    }
    // 商品信息生成对象
    for (const { innerText, title } of $("#J_AttrUL li")) {
        const name = /.*(?=:)/.exec(innerText)[0]
        item[name] = title
    }
    // 过滤信息 并生成domm模板
    let dom = ""
    for (const v of Object.entries(item)) {
        if (过滤器?.[v[0]]) {
            dom += `<li>${v.join(":")}</li>`
            print(v)
        }
    }

    // 加入页面
    $(`<div id="item"><ul>${dom}</ul></div>`).appendTo("body")

    // $("body").css("background-image", 鸟 + "," + 纸)
    print(item)
    print(333333, dom)
}


/**
 * 修复console.log
 * 新增 console.log 别名函数 echo 或 printf
 */
(修复log = () => {
    var iframe = document.createElement('iframe')
    document.body.appendChild(iframe)
    window.console = iframe.contentWindow.console
    window.printf = window.echo = console.log
})();


(async () => {
    // 动态加载JQ
    await import("https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js")
    $ = window?.jQuery ?? window?.$ ?? window.$$

    // 添加css列表
    $("<style>").text(css).appendTo($("head"));




    $(document).ready(function () {

        




        // 列出基本信息()

        // const data = GM_getValue("地址") || []
        //  ? JSON.parse(localStorage["地址"]) : []
        //     淘宝
        //     const arr = $$("div .pic a")
        // 天猫
        // const href = location.href



        // // 页面判断
        // if (/.*:\/\/list\.tmall\.com\/search_product\.htm/.test(location.href)) {
        //     const arr = $("div .productImg-wrap a")
        //     const d = arr.map(({ href }) => href)
        //     // const urls = new Set(...arr.map(({ href }) => href))
        //     // print(urls, typeof (urls), 3333333333333, [...data, ...urls])
        //     // localStorage["地址"] = JSON.stringify(data)
        //     // GM_setValue("地址", arr)
        // }
        // url = "https://api.bootcdn.cn/libraries/jquery.min.json"
        // url = "https://api.bootcdn.cn/jquery.min.json"
        // const rev = await fetch(url)
        // const json = await rev.json()
        // console.log(json)
        //     url = "https://detail.tmall.com/item.htm?spm=a220m.1000858.1000725.9.3dbf4dd4GdLMHA&id=616344637422&skuId=4344116740786&areaId=445300&user_id=2124444518&cat_id=2&is_b=1&rn=8001c69362cb12ba3b85571fd6568e14"
        //     data =await 取材质(url)
        //     print(2222222222,data)
        //     for (const {href} of arr) {
        //         print()
        //     }
    });

})()