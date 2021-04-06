// ==UserScript==
// @name                [絕]远程测试
// @author              絕版大叔丶
// @namespace           远程测试
// @match               *://*/*
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
.gl {
    background-color: #f00;
    border-radius: 25px;
    border: 2px solid #f00;
}
`;
GM_addStyle(css);

const 过滤器 = {};

console.log($, 1111);

// !(async function main() {
//   const jq = await import(
//     "https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"
//   );
//   console.log($, 22222222);
// })();

$(($) => {
  // 动态加载JQ

  $(".coupon-item.coupon-item-d").each((a, el) => {
    const info = {
      类型: $(".tips:first", el).text(),
    };

    过滤器["类型"] = info["类型"].includes("小家电");

    if (过滤器["类型"]) {
      console.log($(el), 2222);
      //   $(el).css(css["背景"]);
      $(el).addClass("gl");
    }
    // document.querySelector("#main > div:nth-child(2) > div.mc > div.coupon-items > div:nth-child(12) > div.c-msg > div.c-range > div:nth-child(1) > span.txt")
  });
  console.log(过滤器);
});

//   // 添加css
//   $i.css({
//     "z-index": 9999,
//     top: y - 20,
//     left: x,
//     position: "absolute",
//     color: "red",
//     "font-size": 14,
//   });
