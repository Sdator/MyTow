// ==UserScript==
// @name                [絕]全神贯注
// @author              絕版大叔丶
// @namespace           https://github.com/Sdator/MyCode/tree/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4
// @icon                https://avatars3.githubusercontent.com/u/17621623?s=40&v=4
// @version             1.6.3
// @match               *://blog.csdn.net/*
// @match               *://www.sohu.com/a/*
// @description         删除所有广告，保留主题内容
// @require             https://cdnjs.loli.net/ajax/libs/jquery/3.4.1/jquery.js
// @updateURL
// @downloadURL
// @grant               GM_getValue
// @grant               GM_setValue
// @grant               GM_addStyle
// @grant               GM_xmlhttpRequest
// ==/UserScript==


let css = `
body {
    display: flex;
    background-color: bisque;
    justify-content: center;
    align-items: center;
    background-image: url();
}
#main {
    padding-top: 30px;
}
`;
//css样式
GM_addStyle(css)


const rules = [
    {
        url: "blog.csdn.net",
        style: `
        #main {
            padding-top: 30px;
            margin: auto;
            width: 70vw;
        }`,
        reDraw() {
            // 重建主题 元素提升到顶部
            $("main").appendTo($("body")).wrap($("<div id='main'></div>"));
            // 删除多余标签
            $("body *").not('#main').not($('#main').find("*")).remove()
            $("[class^=recommend]").remove()
        }
    },
    {
        url: "www.sohu.com",
        style: `
        #main {
        }`,
        reDraw() {
            let 元素 = ".text"
            //兼容另一种特殊页面
            let 特殊页面 = $(".article-box.l")
            if (特殊页面.length) {
                元素 += ",.article-box.l"
                特殊页面.children(":gt(4)").remove()
            }
            // 重建主题
            $(元素).appendTo($("body")).wrap($("<div id='main'></div>"));
            // 删除多余标签
            $("body *").not('#main').not($('#main').find("*")).remove()

        }
    }
];


$(() => {
    const home = location.hostname
    for (const rule of rules) {
        if (home.includes(rule.url)) {
            rule.reDraw()
            GM_addStyle(rule.style)
            break
        }
    }
})