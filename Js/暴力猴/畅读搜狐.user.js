// ==UserScript==
// @name                畅读搜狐
// @author              絕版大叔丶
// @namespace           https://github.com/Sdator/MyCode/tree/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4
// @icon                https://avatars3.githubusercontent.com/u/17621623?s=40&v=4
// @version             1.0
// @match               *://www.sohu.com/a/*
// @description         删除搜狐所有广告，重建主题内容
// @updateURL           https://github.com/Sdator/MyCode/raw/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4/畅读搜狐.user.js
// @downloadURL         https://github.com/Sdator/MyCode/raw/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4/畅读搜狐.user.js
// @run-at              document-end
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
    width: 1024px;
}
`

//css样式
GM_addStyle(css)


$(() => {
    let 元素 = ".text"

    //兼容另一种特殊页面
    let 特殊页面 = $(".article-box.l")
    if (特殊页面.length) {
        元素 += ",.article-box.l"
        特殊页面.children(":gt(2)").nextAll().remove()
    }

    // 重建主题
    $('.text').appendTo($("body")).wrap($("<div id='diy'></div>"));
    // 删除多余标签
    $("body *").not('#diy').not($('#diy').find("*")).remove()
})