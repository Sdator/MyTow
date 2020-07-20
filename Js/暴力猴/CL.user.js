// ==UserScript==
// @name                [絕]++6
// @author              絕版大叔丶
// @namespace           http://hxun.vip
// @match               *://t66y.com/htm_data/*/*/*.html
// @grant               GM_getValue
// @grant               GM_setValue
// @grant               GM_addStyle
// @updateURL           
// @downloadURL         
// @version             1.0
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


let css = `
body {
    display: flex;
    background-color: bisque;
    justify-content: center;
    align-items: center;

}

#diy {
    margin: 50px;
}
`

//css样式
GM_addStyle(css)



$(() => {
    let 元素 = ".tpc_content.do_not_catch"
    // 重建主题
    $(元素).appendTo($("body")).wrap($("<div id='diy'></div>"));
    // 删除多余标签
    $("body *").not('#diy').not($('#diy').find("*")).remove()
    // 删除广告
    // $(".tpc_content.do_not_catch>b:last").next().next().next().prevAll().remove()

    $(".tpc_content.do_not_catch").contents().each(function (k, v) {

        // console.log($(this), v, v.nodeName, 2222);
        const code = $(this).text().codePointAt()

        // if (v.nodeName == "#text" && (code != 160 || code != 10)) {
        if (v.nodeName == "#text" && $(this).text().length > 2) {
            // console.log(1111, $(this).text(), $(this).text() == " ", $(this).text() == null, $(this).text() == undefined, $(this).text() == " ", v.nodeName, 2222);
            // console.log(1111, $(this).text(), v.nodeName, code)
            return false
        }
        $(this).remove()
    });



    // 获取元素文本
    const s = $(元素).html()
    const css = `<font size="3" color="red">magnet:?xt=urn:btih:$<claa></font>`

    // for (const { nodeName } of $(".tpc_content.do_not_catch").contents()) {
    //     if (nodeName != "#text") {
    //         console.log($(this), nodeName, 2222);
    //         $(this).remove()
    //     }
    // }



    // 替换磁链样式
    const text = s.replace(/(?<claa>[A-z0-9]{40})/, css) ?? s.replace(/(?<claa>[A-z0-9]{32})/, css);

    // 覆写元素文本
    $(元素).html(text)

    // 捕获磁链
    // const { groups: { claa } } = s.match(/(?<claa>[A-z0-9]{40})/) ?? s.match(/(?<claa>[A-z0-9]{32})/)
})



