// ==UserScript==
// @name                女孩HHH
// @author              絕版大叔丶
// @namespace           https://github.com/Sdator/MyCode/tree/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4
// @icon                https://avatars3.githubusercontent.com/u/17621623?s=40&v=4
// @version             1.1
// @match               *://www.xxxx.com/a/*
// @description         学习
// @updateURL           https://github.com/Sdator/MyCode/raw/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4/女孩HHH.user.js
// @downloadURL         https://github.com/Sdator/MyCode/raw/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4/女孩HHH.user.js
// @run-at              document-end
// @grant               GM_addStyle
// ==/UserScript==

$(() => {

    $("<div id='img'>").css({
        "display": "flex",
        "flex-direction": "row",
        "justify-content": "center",
        "align-items": "flex-start",
    }).prependTo("body")

    $("<div id='show'>").css({
        "height": "768px",
    }).prependTo("body")

    $("[href$='.jpg']").each(function () {
        let url = window.location.href + $(this).attr("href")
        $("<div>", {
            click: function () {
                $(this).css({
                    "align-self": "flex-start",
                });
            },
            mouseover: function () {
                let css = $(this).css("background")
                console.log(css)
                $("#show").css("background", css)
            },
            mouseout: function () {
                $(this).css({
                    "flex-grow": "0",
                });
            },
            style: `height:100px;width:100px;background:url(${url});background-size:contain;background-repeat:no-repeat;background-position:center`
        }).appendTo("#img");
    })
})