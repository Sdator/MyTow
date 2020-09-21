const fetch = require('node-fetch');

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
    const res = await fetch(url)
    return await res.text()
}


function 搜索(搜索内容)) {
    fetch("https://www.south-plus.net/search.php?", {
        "body": "step=2&keyword=House+Party&method=OR&pwuser=&sch_area=0&f_fid=all&sch_time=all&orderway=postdate&asc=DESC",
        "method": "POST",
    });
}


function main() {
    const API = {

    }
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
}
