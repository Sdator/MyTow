// ==UserScript==
// @name                天猫
// @author              絕版大叔丶
// @namespace           http://hxun.vip
// @match               *://*.tmall.com/*
// @grant GM_getValue
// @grant GM_setValue
// @updateURL           http://localhost:8000/taobao.user.js
// @downloadURL         http://localhost:8000/taobao.user.js
// @version             1.3
// @author              -
// @description         test
// @description:zh-CN   测试用
// @require             https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js
// @compatible         chrome   测试通过
// @noframes
// @run-at              document-end

// ==/UserScript==

// // CDN
// // https://www.bootcdn.cn/jquery/
// // https://cdnjs.loli.net/ajax/libs/jquery/3.5.1/
// {

//     取材质 = async (url) => {
//         const data = await fetch(url, {
//             mode: "no-cors",
//             headers: {
//                 "cache-control": "no-cache",
//                 "cookie": "SameSite=Lax;",
//             }
//         })
//         return await data.text()
//     }

//     // 修复console.log
//     (function () {
//         var iframe = document.createElement('iframe')
//         document.body.appendChild(iframe)
//         window.console = iframe.contentWindow.console
//         print = console.log
//     }());

//     列出基本信息 = () => {
//         const item = {}
//         const 商品信息 = {
//             品牌: "品牌",
//             材质: "材质",
//             成分: "材质成分",
//             销售渠道: "销售渠道类型",
//             大身: "大身材质成分",
//             裆部: "裆部材质成分",
//         }
//         for (const { innerText, title } of $("#J_AttrUL li")) {
//             print(innerText, title)
//             const name = /.*(?=:)/.exec(innerText)[0]

//             // item[name] = 商品信息?.[name] ? title:null
//             // item.商品信息?.[name] = title
//             item[name] = item[name] ?? title

//             // if (商品信息[name]) 商品信息[name] = title
//             // switch (/.*(?=:)/.exec(innerText)[0]) {
//             //     case 商品信息.品牌:
//             //         item.品牌 = title
//             //         break
//             //     case 商品信息.大身:
//             //         item.大身 = title
//             //         break
//             //     case 商品信息.材质:
//             //         item.材质 = title
//             //         break
//             //     case 商品信息.裆部:
//             //         item.裆部 = title
//             //         break
//             //     case 商品信息.销售渠道:
//             //         item.销售渠道 = title
//             //         break
//             // }
//         }

//         // let dom = ""
//         // for (const v of Object.entries(item)) {
//         //     // dom += `<li>${v.join(":")}</li>`
//         //     print(v)
//         // }
//         print(item)

//         // $(`<ul>${dom}</ul>`).appendTo("body")

//     }


//     main = () => {

//         console.log(13213)
//         return 1111
//     }

//     $(document).ready(function () {
//         // const data = GM_getValue("地址") || []
//         // //  ? JSON.parse(localStorage["地址"]) : []
//         // //     淘宝
//         // //     const arr = $$("div .pic a")
//         // // 天猫
//         // const href = location.href
//         // 列出基本信息()
//         // // 页面判断
//         // if (/.*:\/\/list\.tmall\.com\/search_product\.htm/.test(location.href)) {
//         //     const arr = $("div .productImg-wrap a")
//         //     const d = arr.map(({ href }) => href)
//         //     // const urls = new Set(...arr.map(({ href }) => href))
//         //     // print(urls, typeof (urls), 3333333333333, [...data, ...urls])
//         //     // localStorage["地址"] = JSON.stringify(data)
//         //     // GM_setValue("地址", arr)
//         // }
//         // url = "https://api.bootcdn.cn/libraries/jquery.min.json"
//         // url = "https://api.bootcdn.cn/jquery.min.json"
//         // const rev = await fetch(url)
//         // const json = await rev.json()
//         // console.log(json)
//         //     url = "https://detail.tmall.com/item.htm?spm=a220m.1000858.1000725.9.3dbf4dd4GdLMHA&id=616344637422&skuId=4344116740786&areaId=445300&user_id=2124444518&cat_id=2&is_b=1&rn=8001c69362cb12ba3b85571fd6568e14"
//         //     data =await 取材质(url)
//         //     print(2222222222,data)
//         //     for (const {href} of arr) {
//         //         print()
//         //     }
//     });

// }

return {1,2,35}