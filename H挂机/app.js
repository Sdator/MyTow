const { Builder, By, Key, until } = require('selenium-webdriver');
const log = echo = print = console.log;

(async function example() {
    // 创建驱动
    const driver = await new Builder().forBrowser('chrome').build();
    try {
        // 打开页面
        await driver.get('http://www.baidu.com/');
        // 寻找元素
        // await driver.findElement(By.name('q')).sendKeys('webdriver', Key.RETURN);
        // 等待窗口标题发生变化
        // await driver.wait(until.titleIs('webdriver - Google Search'), 1000);

        const cheese = await driver.findElement(By.id('su'));
        console.log(cheese, 11111111);

        // log()

    } finally {
        await driver.quit();
    }
})();