/**
 *
 * @param {String} key 检索关键字
 * @param {function} callback 条件函数
 * @param {Number} time 每次检索时间,默认 1 秒
 * @param {Number} timeOut 超时处理,默认 20 秒
 */
function find_key(key, callback, time, timeOut) {
    return new Promise((resolve, reject) => {
        time = time || 1000
        timeOut = timeOut || 1000 * 10
        let i = 0
        try {
            while (true) {
                // log("等待页面", i * time, currentActivity())
                // 超时处理
                if (i++ * time >= timeOut) {
                    throw new Error("超时")
                }
                if (callback(key)) break
                sleep(time)
            }
            log(++num, "条件成立", key)
            resolve(key)
        } catch (error) {
            reject(error)
        }
    })
}

// 步骤计数器
let num = 0

const is当前页面 = (key) => currentActivity() === key
const is元素存在 = (key) => text(key).find().size() > 0

!function 初始化() {
    // 确保开启无障碍服务才能继续
    auto.waitFor()
    // 设置分辨率
    setScreenMetrics(1080, 1920);
}()

const 领裹酱 = () => {
    log(++num, "打开领裹酱");
    // 1. 运行程序
    app.launchApp("菜鸟裹裹");
    // 2. 领裹酱页面
    return find_key("com.cainiao.wireless.homepage.view.activity.HomePageActivity", is当前页面)
        .then((data) => find_key("领裹酱", is元素存在))
        .then((data) => {
            let dom = text(data).findOne()
            // // 冒泡直到找到可点击的父元素
            while (true) {
                if (dom.clickable()) {
                    break
                }
                dom = dom.parent()
            }
            dom.click()
            log(++num, "点击领裹酱");
        })
        .then((data) => find_key("com.cainiao.wireless.components.hybrid.windvane.activity.GuoGuoNewWebViewActivity", is当前页面))
}

// 签到
const 签到 = () => 领裹酱()
    .then((data) => find_key("找到签到按钮", () => className("android.view.View").clickable(true).depth(17).find().size() > 0))
    .then((data) => {
        log(++num, "点击签到", data);
        // const 签到 = className("android.view.View").indexInParent(22).drawingOrder(0).depth(17).find()
        const 签到 = className("android.view.View").clickable(true).depth(17).find()
        // 如果可签到就点击
        if (签到.size() > 0) {
            签到.click()
            // 等待签到窗口出现后关闭
            find_key("关闭签到窗口", () => indexInParent(31).clickable(true).find().size() == 1)
                .then(() => {
                    indexInParent(31).clickable(true).find().click()
                })
            // click(533, 1447)
        }
        log(++num, "签到完成");
        return "===========签到完成==========="
    })

const 收集点数 = () => 领裹酱().then((data) => {
    log(++num, "开始收集点数");
    const 点数 = text("+").depth(18).find()
    if (点数.size() > 0) {
        // 收集所有点数
        点数.forEach((dom) => {
            while (true) {
                if (dom.clickable()) break
                dom = dom.parent()
            }
            dom.click()
            toastLog(++num, "点击收集点数");
        })
    }
    log(++num, "收集点数完成");
    return "========收集点数完成========"
})

const 八元电卷 = () => 领裹酱()
    .then((data) => find_key("8元寄件券点开", className("android.view.View").text("8元寄件券").find().size()))

    .then((data) => {
        className("android.view.View").text("8元寄件券").find()
        log(++num, "开始收集点数");
        const 点数 = text("+").depth(18).find()
        if (点数.size() > 0) {
            // 收集所有点数
            点数.forEach((dom) => {
                while (true) {
                    if (dom.clickable()) break
                    dom = dom.parent()
                }
                dom.click()
                toastLog(++num, "点击收集点数");
            })
        }
        log(++num, "收集点数完成");
        return "========收集点数完成========"
    })





签到()
    .then((data) => {
        log(data)
        // 步骤计数器清零
        num = 0
        return 收集点数()
    })
    .then((data) => {
        log(data)
    })
