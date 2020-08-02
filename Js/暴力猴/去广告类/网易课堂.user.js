// ==UserScript==
// @name                [絕]网易云课堂去广告
// @author              絕版大叔丶
// @namespace           https://sdator.github.io/
// @icon
// @version             1.0
// @description         网易云课堂去广告
// @match               *://study.163.com/course/courseLearn.htm*
// @match               *://study.163.com/course/introduction/*.htm*
// @match               *://study.163.com/course/courseMain.htm*
//更新地址
// @updateURL
// @match               输入匹配网页
// @require             https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js
// @grant               none
//捐赠地址
// @contributionURL     https://blog.hxun.vip/tools/war3
// @contributionAmount  10软妹
// @compatible          chrome
// ==/UserScript==


延时 = async (t = 1000) => new Promise((rev) => {
    setTimeout(rev, t)
});

class A {
    async get课程(视频列表id) {
        const time = new Date().getTime()
        if (!视频列表id) throw new Error("没有id")
        // 需要变动
        const body =
            `callCount=1
            scriptSessionId=\${scriptSessionId}190
            httpSessionId=3f847fddcc124945b1a2148bd4839f41
            c0-scriptName=PlanNewBean
            c0-methodName=getPlanCourseDetail
            c0-id=0
            c0-param0=string:${视频列表id}
            c0-param1=number:0
            c0-param2=null:null
            batchId=${time}`
        // 视频列表
        const url = `https://study.163.com/dwr/call/plaincall/PlanNewBean.getPlanCourseDetail.dwr?${time}`
        const rev = await fetch(url, {
            method: 'POST',
            body: body
        })
        const txt = await rev.text()
        // 取前部分字符串
        // const newtxt = txt.slice(0, txt.indexOf('dwr.engine._remoteHandleCallback'))
        // 执行字符串  随便加入一个全局变量设置 好拿到返回值
        const listData = eval(txt + `window['aaa']=s3;window['bbb']=s0;`)
        // 写到本地
        // localStorage.api = JSON.stringify(listData)

        let i = 0
        //      记录课程id和名称 用于返回
        const data = []
        for (const { lessonDtos } of listData) {
            for (const { lessonName, description, chapterId, id } of lessonDtos) {
                data.push({
                    "名字": lessonName,
                    "课程ID": id
                })
                console.log(++i, `名字：${lessonName} 课程ID：${id}`)
            }
        }
        return data
    }
    async get视频信息(视频ID, 列表ID) {
        const url = `https://study.163.com/dwr/call/plaincall/LessonLearnBean.getVideoLearnInfo.dwr?${new Date().getTime()}`
        const body =
            `callCount=1
scriptSessionId=\${scriptSessionId}190
httpSessionId=3f847fddcc124945b1a2148bd4839f41
c0-scriptName=LessonLearnBean
c0-methodName=getVideoLearnInfo
c0-id=0
c0-param0=string:${视频ID}
c0-param1=string:${列表ID}
batchId=1596230378140
`
        const rev = await fetch(url, {
            method: 'POST',
            headers: {
                // 补全原有请求的信息 尽量相同
                "providerid": window.ownerId,
                "content-type": "text/plain"
            },
            body: body
        })
        const txt = await rev.text()
        const videoInfo = eval(txt + ";window[s1]=s1")
        return await this.get视频地址(videoInfo.videoId, videoInfo.signature)
    }

    async get视频地址(视频ID, 视频key) {
        const body = {
            videoId: 视频ID,
            signature: 视频key,
            clientType: 1
        }

        const url = new URL("https://vod.study.163.com/eds/api/v1/vod/video")
        // 构建url
        for (const v of Object.entries(body)) {
            url.searchParams.append(...v)
        }
        const rev = await fetch(url, {
            method: 'get',
            credentials: 'include',
            headers: {
                "content-type": "application/x-www-form-urlencoded",

            }
        })
        const txt = await rev.text()
        console.log(txt, 2222222);
    }

    /**
     * 获取页面源码 返回dom节点
     * @param {string} url
     */
    async get源码(url) {

        // 1 读取网站源码 如果请求状态不是200-299 抛出异常并输出
        // 设置不跨域 减少报错
        const rec = await fetch(url, {
            // mode: 'no-cors',
            // credentials: 'include',
            // redirect: 'follow',
            // referrer: 'no-referrer'
        })
        if (!rec.ok)
            throw new Error(rec.statusText)
        const body = await rec.text()
        // 2 使用虚拟dom包装源码 用于后续解析
        const el = document.createElement('html')
        el.innerHTML = body
        return el
    }



    // 封存 直接改用调用接口
    async get视频(视频列表ID) {
        const id = await this.get课程(视频列表ID)
        const data = []
        let i = 0
        for (const { 课程ID } of id) {
            const url = `https://study.163.com/course/courseLearn.htm?courseId=1512007#/learn/video?lessonId=${课程ID}&courseId=1512007`
            data.push(this.get源码(url))
            // 中断操作
            if (++i % 5 || (data.length - i) < 5) {
                for (const v of data) {
                    await v
                }
            }
            if (i > 3)
                break
        }
        for (const v of data) {
            const el = await v
            // const src = $("source", el).attr("src")
            console.log($("source", el), $(el).text().indexOf("mp4"), 44444)
        }
    }
}

const a = new A()
try {
    const 视频列表ID = ["1512007", "1002895002"]
    // 获取匹配到的 id 没拿到就抛出错误
    // let 视频列表id
    // for (const v of 视频列表) {
    //     if (location.href.includes(v)) {
    //         视频列表id = v
    //         break
    //     }
    // }

    // a.get视频(视频列表ID[0]);
    a.get视频信息(1802061, 1512007)


} catch (error) {
    console.error(error);
}




// 广告过滤
(async () => {
    // while (true) {
    //     await 延时()
    //     $(".ux-modal.component-wechat-attention-modal.ux-modal-fadeIn")?.remove()
    // }

    const rules = [
        "ux-modal component-wechat-attention-modal",//二维码广告
        // "m-basewin m-winmark"//登陆窗口
    ]
    document.body.appendChild = new Proxy(document.body.appendChild, {
        // 目标对象、上下文、参数
        async apply(target, ctx, args) {
            const cName = args[0].className
            // console.log("className:", cName, cName == true);
            if (cName != "" && rules.join().includes(cName)) {
                console.log("命中目标", cName);
                await 延时(500)
                // 模拟点击播放
                $(".bbg").click()
                return
            }
            return Reflect.apply(...arguments);
        }
    });

})()
