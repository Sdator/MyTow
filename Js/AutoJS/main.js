// 确保开启无障碍服务才能继续
auto.waitFor()
// 设置分辨率
setScreenMetrics(1080, 1920);

const info = {
    分辨率: {
        宽: device.width,
        高: device.height
    }

}

/**
*
* @param { String } ui 当前正在运行的Activity的名称
* @param { String } key 关键字
*/
function 找到按钮点击(actName, key, callback) {
    while (true) {
        if (currentActivity() === actName) {
            toastLog("启动成功")
            break
        }
        toastLog("等待页面")
        sleep(1000);
    }
    callback(key)
}

// 1. 运行程序
app.launchApp("菜鸟裹裹");

// 2.点击领果酱
找到按钮点击("com.cainiao.wireless.homepage.view.activity.HomePageActivity", "领果酱", (key) => {
    toastLog("继续");
    let dom = text(key).findOne()
    while (true) {
        if (text(key).findOne() != null) {
            toastLog("元素出现了")
            break
        }
    }
    // 冒泡直到找到可点击的父元素
    while (true) {
        if (dom.clickable()) {
            dom.click()
            toastLog("往上找到可点击元素并点击");
            break
        }
        dom = dom.parent()
    }
})

// 加点
找到按钮点击("com.cainiao.wireless.components.hybrid.windvane.activity.GuoGuoNewWebViewActivity", "+", key => {
    const 加点 = text("+").depth(18).find()
    while (true) {
        if (text("+").depth(18).find() != null) {
            toastLog("元素出现了")
            break
        }
    }
    加点.forEach((dom) => {
        while (true) {
            if (dom.clickable()) {
                dom.click()
                toastLog("往上找到可点击元素并点击");
                break
            }
            dom = dom.parent()
        }
    })
})



click(208 + 10, 855 + 10)



// 加点
// 找到按钮点击("com.cainiao.wireless.components.hybrid.windvane.activity.GuoGuoNewWebViewActivity", "+", key => {
//     const 加点 = text("+").depth(18).find()
//     while (true) {
//         if (text("+").depth(18).find() != null) {
//             toastLog("元素出现了")
//             break
//         }
//     }
//     加点.forEach((dom) => {
//         while (true) {
//             if (dom.clickable()) {
//                 dom.click()
//                 toastLog("往上找到可点击元素并点击")
//                 break
//             }
//             dom = dom.parent()
//         }
//     })
// })






// // 加点
// 找到按钮点击("com.cainiao.wireless.components.hybrid.windvane.activity.GuoGuoNewWebViewActivity", "", key => {
//     const 加点 = text("").depth(18).find()
//     while (true) {
//         if (text("+").depth(18).find() != null) {
//             toastLog("元素出现了")
//             break
//         }
//     }
//     加点.forEach((dom) => {
//         while (true) {
//             if (dom.clickable()) {
//                 dom.click()
//                 toastLog("往上找到可点击元素并点击")
//                 break
//             }
//             dom = dom.parent()
//         }
//     })
// })











// log(currentActivity())



// while (true) {
//     if (currentActivity() === "com.cainiao.wireless.homepage.view.activity.HomePageActivity" && text("领果酱").findOne()) {
//         toastLog("启动成功")
//         break
//     }
//     toastLog("等待页面")
//     sleep(1000);
// }





// log(text("领果酱").find())
// const ela = text("领果酱").find(clickable())
// log(ela)



toastLog("完成");

// id("home_multi_function_list").findOne().children().forEach(child => {
//     var target = child.findOne(id("home_muti_function_item_img"));
//     target.click();
// });

// toastLog([el.children().Rect, el.children().boundsInScreen,])
// log(el.boundsInParent(), el.boundsInScreen())
let i = 0
// for (let v in Object.entries(el)) {
//     log(i++, v)
// }

// log(Object.entries({ a: 1, b: 2 }))



// log(Object.prototype.toString.call(el))



// // 滑动
// swipe(1080 / 2, 1920 / 2, 1080 / 2, 1920 / 4, 500);
// // 等待 1秒
// sleep(1000)
// swipe(1080 / 2, 1920 / 2, 1080 / 2, 1920 / 4, 500);



// log("准备点击")
// id("home_multi_function_list").findOne().children().forEach(child => {
//     log("点击按钮")
//     var target = child.findOne(id("home_muti_function_item_img"));
//     target.click();
// });

// className("android.view.View").desc("5元寄件券").findOne().click()
// log("延迟")
// sleep(1000)
// className("android.view.View").desc("18时开始").findOne().click()

// className("android.view.View").text("20").findOne().click()

// log("点击完成")

// const el = className("android.widget.RelativeLayout").depth(15).findOne()
// // 获取子控件数量
// log(el.childCounadt())

// el.click();


// id("home_multi_function_list").findOne().children().forEach(child => {
//     var target = child.findOne(id("home_muti_function_item_img"));
//     target.click();
// });



// id("home_multi_function_list").findOne().children().forEach(child => {
//     var target = child.findOne(id("home_muti_function_item_img"));
//     target.click();
//     // log(typeof target)
//     for (const [v, k] of object.entries()) {
//     }
// });

// async function 领果酱() {
//     return new Promise(() => {
//         while (true) {
//             await 延时()
//             let 领果酱 = id("home_multi_function_list").findOne().children()
//             领果酱.forEach(child => {
//                 var target = child.findOne(id("home_muti_function_item_img"));
//                 target.click();
//                 break
//             });
//         }
//     })
// }


// function 延迟(t, fun) {
//     return new Promise((resolve) => {
//         setTimeout(resolve, t)
//         log('test....')
//     })
// };

// 延迟()





// 元素属性
// com.stardust.automator.UiObject@24b3f;
// boundsInParent: Rect(0, 0 - 182, 162);
// boundsInScreen: Rect(17, 234 - 199, 396);
// packageName: com.cainiao.wireless;
// className: android.widget.ImageView;
// text: null;
// contentDescription: null;
// viewId: com.cainiao.wireless:id/home_muti_function_item_img;
// checkable: false;
// checked: false;
// focusable: false;
// focused: false;
// selected: false;
// clickable: false;
// longClickable: false;
// enabled: true;
// password: false;
// scrollable: false;
// [ACTION_SELECT, ACTION_CLEAR_SELECTION, ACTION_ACCESSIBILITY_FOCUS] 123


// 主线程接收到 退出事件
events.on("exit", function () {
    toast("脚本已结束");
});



// function setTime(callback) {
//     setTimeout(() => {
//         callback();
//         console.log("我被最后输出，惨那。");
//     }, 0);
//     console.log("异步执行代码。");
// };
// setTime(() => {
//     console.log("多会可以执行我呢？");
// });

// id("action_bar_root").findOne().parent().waitFor()

// // 查找领果酱按钮并点击
// id("home_multi_function_list").findOne().children().forEach(child => {
//     var target = child.findOne(id("home_muti_function_item_img"));
//     target.click();
// });



// threads.start(function () {
//     // 注册事件

//     while (running) {
//         log("running = true");
//     }
// });

// sleep(2000);
// running = false;
// console.info("running = false");
