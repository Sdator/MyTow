
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


// console.log(abc, 3333, globalThis, globalThis == window)



// newWindow = window
window差集 = () => {

    const iframe = document.createElement('iframe')
    document.body.appendChild(iframe)

    // console.log(Object.keys(iframe.contentWindow), Reflect.ownKeys(iframe.contentWindow), 11111111);
    // const newWindow = new Set(Object.keys(iframe.contentWindow))
    // const selfWindow = new Set(Object.keys(unsafeWindow))
    // const c = [...selfWindow].filter(x => !newWindow.has(x))

    // 拷贝一个新对象
    const newWindow = Object.assign({}, unsafeWindow)

    // 删除 window 对象
    for (const v of Object.keys(newWindow)) {
        if (Object.prototype.toString.call(newWindow[v]) == "[object Window]") {
            delete newWindow[v]
        }
    }

    // 删除相同的对象属性
    for (const v of Object.keys(iframe.contentWindow)) {
        if (v in newWindow) {
            delete newWindow[v]
        }
    }
    // tag = Symbol()
    // localStorage["Air_" + new Date().getTime()] = JSON.stringify(newWindow)
    console.log(newWindow, 333333);

    iframe.remove()

}

window差集()


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
            el = $("video source")
            console.log("视频：", el?.attr("src"));
        },
    },
    {
        type: "button",
        value: "检测音频元素",
        click() {
            el = $("source")
            console.log("音频：", el);
        }
    },
]



// 生成按钮加入父元素中
for (const el of doms) {
    $('<input/>', el).appendTo(app);

    // 代理
    // el.click = new Proxy(el, {
    //     apply(target, ctx, args) {
    //         console.log(...arguments);
    //         return Reflect.apply(...arguments);
    //     }
    // })
}
