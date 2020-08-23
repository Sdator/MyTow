// // 多线程
// var running = true;

// // var appName = rawInput("菜鸟裹裹");

// const isRun = launchApp("菜鸟裹裹");


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

// log('abc....')


function setTime(callback) {
    setTimeout(() => {
        callback();
        console.log("我被最后输出，惨那。");
    }, 0);
    console.log("异步执行代码。");
};
setTime(() => {
    console.log("多会可以执行我呢？");
});

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
