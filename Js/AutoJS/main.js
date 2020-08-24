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


// 确保开启无障碍服务才能继续
auto.waitFor()

// log("运行程序")
// // 打开菜鸟裹裹
// const isRun = launchApp("菜鸟裹裹");
// if (!isRun) {
//     log("打开菜鸟裹裹失败")
//     toast("打开菜鸟裹裹失败");
//     exit();
// }

log("准备点击")
// id("home_multi_function_list").findOne().children().forEach(child => {
//     log("点击按钮")
//     var target = child.findOne(id("home_muti_function_item_img"));
//     target.click();
// });

className("android.view.View").desc("5元寄件券").findOne().click()
log("延迟")
sleep(1000)
className("android.view.View").desc("18时开始").findOne().click()
log("点击完成")

// const el = className("android.widget.RelativeLayout").depth(15).findOne()
// // 获取子控件数量
// log(el.childCount())

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
