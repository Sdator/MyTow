// ==UserScript==
// @name                [絕]网易云课堂去广告
// @author              絕版大叔丶
// @namespace           https://sdator.github.io/
// @icon
// @version             1.0
// @description         网易云课堂去广告
// @match               *://study.163.com/course/courseLearn.htm?*
//更新地址
// @updateURL
// @match               输入匹配网页
// @require             https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js
// @grant               none
//捐赠地址
// @contributionURL     https://blog.hxun.vip/tools/war3
// @contributionAmount  10软妹
// @compatible          chrome
// ==/UserScript==


延时 = async (t = 1000) => new Promise((rev) => {
    setTimeout(rev, t)
});

(async () => {
    // while (true) {
    //     await 延时()
    //     $(".ux-modal.component-wechat-attention-modal.ux-modal-fadeIn")?.remove()
    // }

    const rules = [
        "ux-modal component-wechat-attention-modal",//二维码广告
        // "m-basewin m-winmark"//登陆窗口
    ]
    document.body.appendChild = new Proxy(document.body.appendChild, {
        // 目标对象、上下文、参数
        async apply(target, ctx, args) {
            const cName = args[0].className
            // console.log("className:", cName, cName == true);
            if (cName != "" && rules.join().includes(cName)) {
                console.log("命中目标", cName);
                await 延时(500)
                // 模拟点击播放
                $(".bbg").click()
                return
            }
            return Reflect.apply(...arguments);
        }
    });

})()
