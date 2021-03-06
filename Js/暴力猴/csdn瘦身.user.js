// ==UserScript==
// @name                [絕]csdn瘦身
// @author              絕版大叔丶
// @namespace           https://sdator.github.io/
// @icon                https://avatars3.githubusercontent.com/u/17621623?s=40&v=4
// @version             1.6.4
// @match               *://blog.csdn.net/*
// @description         删除csdn所有广告，保留主题内容
// @updateURL           https://github.com/Sdator/MyCode/raw/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4/csdn%E7%98%A6%E8%BA%AB.user.js
// @downloadURL         https://github.com/Sdator/MyCode/raw/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4/csdn%E7%98%A6%E8%BA%AB.user.js
// @grant               GM_addStyle
// ==/UserScript==



let css = `
body {
    display: flex;
    background-color: bisque;
    justify-content: center;
    align-items: center;
    background-image: url();
}
#diy {
    padding-top: 30px;
    margin: auto;
    width: 70vw;
}
main{
    float: none;
}
`
//css样式
GM_addStyle(css)

$(() => {

    // 重建主题 元素提升到顶部
    $("main").appendTo($("body")).wrap($("<div id='diy'></div>"));
    // 删除多余标签
    $("body *").not('#diy').not($('#diy').find("*")).remove()
    $("[class^=recommend]").remove()
})