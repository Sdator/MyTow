const { Builder, By, Key, until } = require('selenium-webdriver');

const { Options } = require('selenium-webdriver/chrome');
const options = new Options();
// 设置无头浏览器默认属性
// options.addArguments('')
//     .addArguments('user-agent="Mozilla/5.0 (iPod; U; CPU iPhone OS 2_1 like Mac OS X; ja-jp) AppleWebKit/525.18.1 (KHTML, like Gecko) Version/3.1.1 Mobile/5F137 Safari/525.20');




(async function example() {
    // 构建一个谷歌浏览器 驱动控制器
    let driver = await new Builder().forBrowser('chrome').build();
    try {
        const url = "https://www.baidu.com"

        await driver.get(url);
        // await driver.findElement(By.id('kw')).sendKeys('xxxx', Key.ENTER); //网页操作

        // 添加 cookie
        // await driver.manage().addCookie({ name: 'foo', value: 'bar' });
        // // 读取 cookie
        // driver.manage().getCookie('foo').then(function (cookie) {
        //     console.log('cookie details => ', cookie);
        // });
        // let gmailLink = driver.findElement(By.linkText("Gmail"))
        // 找到搜索栏并输入字符串
        await driver.findElement(By.id('kw')).sendKeys('xxxx');
        // 找到搜索按钮
        let gmailLink = driver.findElement(By.id('su'))
        // 获取元素的矩形属性
        let offset = await gmailLink.getRect();
        // 获取元素相对于客户区的位置
        let x = await offset.x;
        let y = await offset.y;
        console.log(offset)
        const actions = driver.actions({ async: true });
        // 模拟鼠标位置点击
        await actions.move({ x: parseInt(x), y: parseInt(y) }).pause(3000).perform();


        // 鼠标移动到元素 执行中键单击元素
        // let searchBtn = driver.findElement(By.linkText("Sign in"));
        // const actions = driver.actions({ async: true });
        // await actions.move({ origin: searchBtn }).press().perform();

        // // 右击元素
        // let searchBtn = driver.findElement(By.linkText("Sign in"));
        // const actions = driver.actions({async: true});
        // await actions.contextClick(searchBtn).perform();

        // // 双击元素
        // let searchBtn = driver.findElement(By.linkText("Sign in"));
        // const actions = driver.actions({ async: true });
        // // Perform double-click action on the element
        // await actions.doubleClick(searchBtn).perform();

        // 画面聚焦到元素 屏幕滚动到元素的位置
        // let gmailLink = driver.findElement(By.linkText("Gmail"));
        // const actions = driver.actions({ async: true });
        // // Performs mouse move action onto the element
        // await actions.move({ origin: gmailLink }).perform();

        // 释放鼠标
        // let sourceEle = driver.findElement(By.id("draggable"));
        // // Store 'box B' as source element
        // let targetEle = driver.findElement(By.id("droppable"));
        // const actions = driver.actions({ async: true });
        // await actions.move({ origin: sourceEle }).press().perform();
        // // Performs release event on target element
        // await actions.move({ origin: targetEle }).release().perform();


        // 读取所有cookie
        driver.manage().getCookies().then(function (cookies) {
            console.log('cookie details => ', cookies);
        });


        // console.log(await driver.wait(until.titleIs('xxxx_百度搜索'), 1000))
    } finally {
        await driver.quit();
    }

})();
