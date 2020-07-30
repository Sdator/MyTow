
// ==UserScript==
// @name                [絕]辅助模块
// @author              絕版大叔丶
// @namespace           https://sdator.github.io/
// @icon
// @version             1.0
// @match               *://*/*
// @description         辅助模块
// @grant               GM_addStyle
// @require             https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js
// @run-at              document-start
// ==/UserScript==




let css = `
#AirBox {
    display: flex;

    flex-direction: column;
    justify-content: flex-start;
    // align-items: center;


    background-color: rgb(116, 41, 187);

    position: fixed;
    left: 10px;
    top: 10px;

    height:50vh;
}

#AirBox input{

    width: 100px;
    height:50px;

    box-sizing: content-box;
    margin: 5px;

}

`
//css样式
GM_addStyle(css)

// delete window.Proxy
// delete window.proxy
abc = window

console.log(abc, 3333, globalThis, globalThis == window)




// newWindow = window
window差集 = () => {
    // const el = $("<iframe/>")
    // el.appendTo("body")
    // console.log(el[0], Object.keys(el[0]), 2222);
    // const newWindow = window
    const iframe = document.createElement('iframe')
    document.body.appendChild(iframe)
    // window.console = iframe.contentWindow.console


    // console.log(Object.keys(iframe.contentWindow), Reflect.ownKeys(iframe.contentWindow), 11111111);
    // for (const v of Object.keys(iframe.contentWindow)) {
    //     if (v in newWindow) {
    //         delete newWindow.v
    //     }
    // }
    // console.log(window, 1111);



    // ?.contentWindow

    // Object.keys(el)

}

// window差集()


const app = $('<div/>', {
    id: "AirBox",
    css: {
        "z-index": 999999999,
    },
}).appendTo("body");



const doms = [
    {
        type: "button",
        value: "检测视频元素",
        click() {
            const el = $("video")
            console.log(el);
            console.log(abc, 3333, globalThis, window)
        },
    },
    {
        type: "button",
        value: "检测音频元素",
        click() {
            const el = $("video")
            console.log(el);
        }
    },
]

for (const el of doms) {
    // 重建主题
    $('<input/>', el).appendTo(app);

}
