// 线程 注册按下音量键- 退出脚本
threads.start(function () {
    //在子线程中调用observeKey()从而使按键事件处理在子线程执行
    events.observeKey();
    events.on("key_down", function (keyCode, events) {
        //音量键关闭脚本
        if (keyCode == keys.volume_up) {
            exit();
        }
    });
});