/**
 *
 * @param {String} key 检索关键字
 * @param {function} callback 匹配条件
 * @param {Number} time 每次检索时间,默认 1 秒
 * @param {Number} timeOut 超时处理,默认 20 秒
 */
function find_key(key, callback, time, timeOut) {
    return new Promise((resolve, reject) => {
        time = time || 1000
        timeOut = timeOut || 1000 * 20
        let i = 0

        try {
            while (true) {
                log("等待页面", i * time, currentActivity())
                // 超时处理
                if (i++ * time >= timeOut) {
                    throw new Error("超时")
                }
                if (callback(key)) {
                    toastLog("启动成功")
                    break
                }
                sleep(time)
            }
            resolve(key)
        } catch (error) {
            reject(error)
        }
    })
}

const is当前页面 = (key) => currentActivity() === key
const is元素存在 = (key) => text(key).find().size() > 0
const is元素存在depth = (key) => text(key).depth(18).find().size() > 0


// 1. 运行程序
// app.launchApp("菜鸟裹裹");

// 2. 自动化
// drawingOrder 控件在父控件的绘制顺序。
// indexInParent 控件在父控件的位置。

'auto'



// function 签到() {
//     return new Promise(() => {
//         find_key("com.cainiao.wireless.components.hybrid.windvane.activity.GuoGuoNewWebViewActivity", is当前页面)
//             .then((data) => {
//                 click(533, 1447)
//             }
//     })

// }


find_key("com.cainiao.wireless.homepage.view.activity.HomePageActivity", is当前页面)
    .then((data) => find_key("领裹酱", is元素存在))
    .then((data) => {
        let dom = text(data).findOne()
        // // 冒泡直到找到可点击的父元素
        while (true) {
            if (dom.clickable()) {
                dom.click()
                toastLog("往上找到可点击元素并点击");
                break
            }
            dom = dom.parent()
        }
    })
    // 签到
    .then((data) => {
        className("android.view.View").indexInParent(22).drawingOrder(0).depth(17).find().click()
        return find_key("com.cainiao.wireless.components.hybrid.windvane.activity.GuoGuoNewWebViewActivity", is当前页面)
    }).then((data) => {
        back()
    })
    // 收集点数
    .then((data) => find_key("com.cainiao.wireless.components.hybrid.windvane.activity.GuoGuoNewWebViewActivity", is当前页面))
    .then((data) => find_key("+", is元素存在depth))
    .then((data) => {
        // 收集所有点数
        text("+").depth(18).find().forEach((dom) => {
            while (true) {
                if (dom.clickable()) {
                    dom.click()
                    toastLog("往上找到可点击元素并点击");
                    break
                }
                dom = dom.parent()
            }
        })
    }
    )
