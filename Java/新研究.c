ke模拟器
读写存档流程

openRecordStore RES1//打开存档文件夹
getRecord RES1_8 //读取存档文件
Custom.jar.getResourceStream: local/scene7_high.local (null) //读取资源流
Custom.jar.getResourceStream: 6.yy (10186)//读取资源流
openRecordStore RES1
openRecordStore RESLIST1




进入资料仓报错信息

    openRecordStore RES1
    openRecordStore RESLIST1
    Custom.jar.getResourceStream: local/scene10_high.local (null) //缺少文件
    >>java.lang.NegativeArraySizeException      // 错误 数组超出下标 ，，， 检查下标值
    >>	at q.run(Unknown Source)
    >>	at java.lang.Thread.run(Thread.java:534)


发呆太久清理下线

    SocketConnection: socket://101.201.239.137:9090
    host:101.201.239.137
    port:9090



登入游戏卡屏

    Custom.jar.getResourceStream: pet.dat (1623)
    Custom.jar.getResourceStream: pet.yy (1881)
    Custom.jar.getResourceStream: local/scene10_high.local (null)
    >>java.lang.NegativeArraySizeException
    >>	at q.run(Unknown Source)
    >>	at java.lang.Thread.run(Unknown Source)


初始打开游戏报错信息

    加速类型=2加速参数=1000最小延迟=1000
    >>java.lang.StringIndexOutOfBoundsException: String index out of range: -5
    >>java.lang.StringIndexOutOfBoundsException: String index out of range: -5
    openRecordStore OPTION
    >>	at java.lang.String.substring(Unknown Source)
    >>	at kava.lang.Threak.getData(Threak.java:92)
    >>	at kava.lang.Threak.getData(Threak.java:92)
    >>	at kava.lang.Threak.sleep(Threak.java:117)
    >>	at h$a.run(Unknown Source)
    >>	at emulator.custom.subclass.TimerThread.mainLoop(Unknown Source)
    >>	at emulator.custom.subclass.TimerThread.run(Unknown Source)





h
    bv  当前地图对象     x@17fd62        x  地图对象类型
    bj  g@1c6e487      g@1a947fe     ap 
    ch  地图对应yy号
g
    bo 存档验证
    el  true 邮件提示 聊天提示私聊信息
    cj  当前选中地图代码还没过图  可瞬移
    hv  过图后的人物的位置
    gO  当前所在地图代码
    mN  NPC 数组
        gif     名字
        a       动作
            0   播放速度
            1   改了会卡屏  需重启
            2   当前动画帧
        gry     x轴
        odl     y轴
        inx     是否显示

    gk  坐标镜像
    k5  x坐标镜像 修改无效自动还原
    53  y坐标镜像



验证搜索 附近特征码 还没处理

FF FF 00 00 00 00 00 01 00 00 01 00 00 01 00 00 02 01 👍 00 00 00 00 00 00
FF FF 00 00 00 00 00 ?? 00 00 01 00 00 01 00 00 ?? ?? ?? 00 00 00 00 00 00



FF FF 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 FF FF FF FF 00 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 FF FF FF FF 00 00 00 00 00 00 00 00 00 00 00 00

FF FF 00 00 00 00 00 00 00 00 01 00 00 01 00 00 03 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 03 FF 00 00 00 00 00 00 02 02 

00 00 00 00 1B




1D 00 00 00 00 00 00 00 FF FF FF FF 00 00 00 00 
00 00 00 00 00 00 E2 00 C6 00 00 00 00 00 00 00 
F8 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
00 00 FF FF 00 00 00 00 00 00 00 00 00 00 00 00 
00 00 00 00 FF FF FF FF 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 FF FF FF FF 
00 00 00 00 00 00 00 00 00 00 00 00 FF FF 00 00 
00 00 00 01 00 00 01 00 00 01 00 00 02 01 👍 00 
00 00 00 00 00 01 00 00 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 00 03 FF 00 
00 00 00 00 00 02 02 00 00 00 01 1B 00 01 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
00 01 00 00 00 01 00 00 00 00 00 00 00 00 00 00
00 00 00 00 00 00 00 00 00 00 00 00 78 8A 72 0C 
60 9C 78 0A 58 DD DC 09 00 00 00 00 00 00 00 00 
80 D6 54 0A 58 DD DC 09 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 C8 6E 58 0A A0 6F 58 0A 
E0 6F 58 0A 20 70 58 0A 60 70 58 0A 98 70 58 0A 
B0 70 58 0A D0 70 58 0A F0 70 58 0A 10 71 58 0A 
28 71 58 0A 40 71 58 0A 58 71 58 0A 70 71 58 0A
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
C8 DB 3E 0C 58 DD DC 09 88 71 58 0A 98