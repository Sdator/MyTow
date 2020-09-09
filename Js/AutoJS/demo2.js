// const el = className("android.view.View").clickable(true).depth(17).find()

// var el = indexInParent(31).clickable(true).find()
// var el = text("关闭应用").find()
var el = depth(15).indexInParent(3).clickable(true).find()
var el = className("android.view.View").text("8元寄件券").find()

var el = depth(14).indexInParent(3).find()


// let i = 0
// el.forEach(v => {
//     log(++i, v)
// });

// className("android.view.View").text("立即兑换").findOne().click()
// text = 立即兑换

log(el.size())

//


// let el = text("关闭应用").find()
// 条件运行 = (callback) => new Promise((resolve) => {
//     while (true) {
//         if (callback()) break
//     }
//     resolve()
// })

// log(111111111)


// drawingOrder 控件在父控件的绘制顺序。
// indexInParent 控件在父控件的位置。

// let el = indexInParent(16).clickable(true).find()
// let el = className("android.view.View").text("浏览商品得裹酱").find()

// let el = indexInParent(31).clickable(true).find()
// log(el.size())