async function reload(url = "http://localhost:8000/main.js") {
    await import(url + "?t=" + Math.random())
    console.log(123);
}


function 延时(t = 2000) {
    return new Promise(fun => {
        setTimeout(fun, t)
    })
}


(async () => {
    await 动态加载()
    console.log(4567);
})()
