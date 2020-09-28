const fetch = require('node-fetch');
// const HttpProxyAgent = require('http-proxy-agent');
const ProxyAgent = require('simple-proxy-agent');


async function 任务请求(任务id, 操作类型) {
    const data = {
        H_name: "tasks",
        action: "ajax",
        cid: 任务id,
        actions: 操作类型,
        nowtime: new Date().getTime(),
        verify: "e419085d"
    }
    const url = new URL("https://www.south-plus.net/plugin.php")
    // 构建url
    for (const v of Object.entries(data)) {
        url.searchParams.append(...v)
    }
    const res = await fetch(url, {
        headers: {
            // agent: new HttpProxyAgent("http://127.0.0.1:10000"),
            agent: new ProxyAgent('http://0.0.0.0:10000', {
                tunnel: true, // If true, will tunnel all HTTPS using CONNECT method
                timeout: 5000, // Time in milli-seconds, to maximum wait for proxy connection to establish
            }),
            Cookie: "eb9e6_lastpos=other; eb9e6_cknum=UwUICFACDwVRBDE7BltQUwUOBAQEA1FUA1FTBwEDUQoCUQMEUgNSU1IDVFc%3D; eb9e6_ck_info=%2F%09; eb9e6_winduser=UwMDBVEBADpfUAhTD10BBlBVVFVUAAQAVQdTVFoKUV0FBgsABAgDA28%3D; peacemaker=1; eb9e6_lastvisit=0%091599678235%09%2Fplugin.php%3FH_name-tasks.html; eb9e6_ol_offset=54320"
        }
    })
    return await res.text()
}


function 搜索(搜索内容) {
    fetch("https://www.south-plus.net/search.php?", {
        "body": "step=2&keyword=House+Party&method=OR&pwuser=&sch_area=0&f_fid=all&sch_time=all&orderway=postdate&asc=DESC",
        "method": "POST",
    });
}


(async () => {
    console.log(113123)
    // const API = {
    // }
    const 操作类型 = {
        申请任务: "job",
        完成任务: "job2"
    }
    const 任务ID列表 = [14, 15]
    let msg
    for (const ID of 任务ID列表) {
        msg = await 任务请求(ID, 操作类型.申请任务)
        if (msg.includes("已经申请")) console.log("申请成功")
        else console.log("已经申请过了")

        msg = await 任务请求(ID, 操作类型.完成任务)
        if (msg.includes("成功")) console.log("任务完成")
        else console.log("任务失败")
    }

})()
