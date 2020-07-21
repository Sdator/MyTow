// ==UserScript==
// @name                [絕]++6
// @author              絕版大叔丶
// @namespace           http://t66y.com
// @match               *://t66y.com/htm_data/*/*/*.html
// @grant               GM_getValue
// @grant               GM_setValue
// @grant               GM_addStyle
// @updateURL
// @downloadURL
// @version             1.0
// @description:zh-CN   重构页面
// @compatible          chrome测试通过
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
    width: 50vw;
}

#magnet {
    width: 20px;
    height: 40px;
}
`



/**
 * 复制文本到剪切板
 * @param {string}} text
 */
function copyText(text) {
    const input = document.createElement('input')
    document.body.appendChild(input)
    input.value = text; // 修改文本框的内容
    input.select(); // 选中文本
    document.execCommand("copy"); // 执行浏览器复制命令
    document.body.removeChild(input)
}

/**
 * 页面加载完毕 事件
 */
$(() => {
    let 元素 = ".tpc_content.do_not_catch"
    // 重建主题
    $(元素).appendTo($("body")).wrap($("<div id='diy'></div>"));
    // 删除多余标签
    $("body *").not('#diy').not($('#diy').find("*")).remove()
    $("head *").not($('style')).remove()

    // 删除广告 只对部分有用
    // $(".tpc_content.do_not_catch>b:last").next().next().next().prevAll().remove()
    // 删除大部分广告
    $(".tpc_content.do_not_catch").contents().each(function (k, v) {
        // 当碰到有效的文本元素 跳出递归
        if (v.nodeName == "#text" && $(this).text().length > 2) {
            return false
        }
        // 删除元素
        $(this).remove()
    });

    // 获取元素文本
    const html = $(元素).html()
    const el = `<font id="magnet" size="3" color="red">magnet:?xt=urn:btih:$<claa>   </font>`

    // 替换磁链样式
    const text = html.replace(/(?<claa>[A-z0-9]{40})/, el) ?? html.replace(/(?<claa>[A-z0-9]{32})/, el);

    // 覆写元素文本
    $(元素).html(text)

    // 为按钮添加点击事件
    $('<input/>', {
        type: "button",
        value: "复制",
        id: "copy",
        click: function (e) {
            copyText($("#magnet").text())
            漂浮效果(e)
        },
        css: {
            "font-size": 20,
            "height": "50px",
            "width": "100px",
        }
    }).appendTo("#magnet");

    //css样式
    GM_addStyle(css)

})


/**
 * 效果
 */
漂浮效果 = (e) => {
    console.log(1111);
    // 1-10随机整数
    const n = Math.ceil(Math.random() * 10);
    //单、双数 显示不同效果
    let $i = n % 2 ? $('<b/>').text('复制成功！美好的夜晚开始了！') : $('<b/>').text('❤');
    const x = e.pageX, y = e.pageY;//获取鼠标点击的位置坐标

    // 添加css
    $i.css({
        "z-index": 9999,
        "top": y - 20,
        "left": x,
        "position": "absolute",
        "color": 'red',
        "font-size": 14,
    });
    $("body").append($i);
    // 添加动画css
    $i.animate({
        // 动画
        "top": y - 180,
        "opacity": 0
    }, 1500, function () {
        $(this).remove();
    })

}