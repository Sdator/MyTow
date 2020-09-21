


const http = require('http')
const express = require('express')

const hostname = '127.0.0.1'
const port = 3000
const app = express()

// 路由处理
app.get("/", (req, res) => {
    // 返回请求体
    res.send('你好')
})
const server = app.listen(port, hostname, () => {
    console.log(`服务器运行在 http://${hostname}:${port}/`)
})
// 向该 process 发送 SIGTERM 信号，并使用进程的信号处理程序进行处理
process.on('SIGTERM', () => {
    server.close(() => {
        console.log('进程已终止')
    })
})





// 内置http服务器
// const httpServer = http.createServer((req, res) => {
//     // 服务器收到浏览器web请求后，打印一句话
//     console.log("recv req from browser");
//     // 服务器给浏览器回应消息
//     res.end("hello browser");
// })

// httpServer.listen(port);
