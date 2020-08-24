// ==UserScript==
// @name                [絕]B站屏蔽特定up
// @author              絕版大叔丶
// @namespace           https://sdator.github.io/
// icon                 https://avatars3.githubusercontent.com/u/17621623?s=40&v=4
// @version             1.0
// @match               *://www.bilibili.com/*
// @description         学习
// @run-at              document-end
// @grant               GM_addStyle
// @grant               GM_getValue
// @grant               GM_setValue
// @require             https://cdnjs.loli.net/ajax/libs/jquery/3.4.1/jquery.js
// @contributionAmount  10软妹
// ==/UserScript==

const css = `
"font-size": 20,
"height": "600px",
"width": "200px",
"z-index": 999999999,
"backgroundcolor": "rgb(255 120 216)"
`;

const 延迟 = (t = 500) => new Promise((resolve) => {
    setTimeout(resolve, t)
});

// 广告过滤
(async () => {


    document.addEventListener('DOMContentLoaded', function (a, b, c) {
        console.time()
        // document.removeEventListener('DOMContentLoaded', arguments.callee, false);
        console.log(...arguments);
        console.timeEnd()

    }, false)



    // $(`<div/>`, {
    //     id: "set",
    // }).appendTo("body")
    // const UP黑名单 = ["医生", "皮卡丘"]
    // console.log(6666666666, a);
    // $(".video-page-card").each(function () {
    //     console.log(6666666666);
    //     // $(this).remove()
    //     // const isUP=
    //     // .find("count up").text().includes("v")
    //     // if (isUP) {
    //     // console.log(121231, v, 11111, $(this));
    // })

    // const rules = [
    //     "video-page-card",//推荐列表
    // ]
    // let isA
    // document.ready

    // document.body.appendChild = new Proxy(document.body.appendChild, {
    // document.ready = new Proxy(document.ready, {
    //     // 目标对象、上下文、参数
    //     async apply(target, ctx, args) {
    //         // const cName = args[0].className
    //         // if (!isA) {
    //         //     isA = false
    //         //     console.log(args);
    //         // }
    //         // console.log("className:", cName, cName == true);
    //         // if (cName != "" && rules.join().includes(cName)) {
    //         //     console.log("命中目标", $('.count.up').text());
    //         //     // await 延时(500)
    //         //     // 模拟点击播放
    //         //     // $(".bbg").click()
    //         //     // return
    //         // }
    //         return Reflect.apply(...arguments);
    //     }
    // });

})()
