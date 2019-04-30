# -*- coding: utf-8 -*-
'''
by 绝 2019.4.28

解析动漫花园【解析待写】
    需要填写服务器信息（梯子）

解析nyaa【已完成】

'''
# 枚举类型
from enum import Enum, unique
import re
from AirCom import *

@unique
class 分类(Enum):
    全部 = 0
    動畫 = 2
    季度全集 = 31
    漫畫 = 3
    港台原版 = 41
    日文原版 = 42
    音樂 = 4
    動漫音樂 = 43
    同人音樂 = 44
    流行音樂 = 15
    日劇 = 6
    ＲＡＷ = 7
    遊戲 = 9
    電腦遊戲 = 17
    電視遊戲 = 18
    掌機遊戲 = 19
    網絡遊戲 = 20
    遊戲周邊 = 21
    特攝 = 12
    其他 = 1


@unique
class 字幕组(Enum):
    全部 = 0
    動漫花園 = 117
    动漫国字幕组 = 303
    极影字幕社 = 185
    咪梦动漫组 = 710
    悠哈C9字幕社 = 151
    喵萌奶茶屋 = 669
    天使动漫论坛 = 390
    LoliHouse = 657
    喵萌茶会字幕组 = 468
    雪飄工作室 = 37
    DHR動研字幕組 = 407
    cc动漫 = 604
    caRaws = 695
    漫貓字幕組 = 423
    风之圣殿 = 434
    幻樱字幕组 = 241
    八重樱字幕组 = 663
    千夏字幕组 = 283
    诸神kamigami字幕组 = 288
    桜都字幕组 = 619
    漫游字幕组 = 134
    ANKRaws = 375
    LoveEcho = 504
    天行搬运 = 602
    時雨初空 = 570
    YMDR发布组 = 720
    西农YUI汉化组 = 525
    青森小镇 = 708
    风车字幕组 = 454
    ZERO字幕组 = 391
    动音漫影 = 88
    TUcaptions = 492
    白恋字幕组 = 438
    豌豆字幕组 = 520
    波洛咖啡厅 = 627
    飞龙骑脸字幕组 = 709
    澄空学园 = 58
    届恋字幕组 = 703
    爱恋字幕社 = 47
    轻之国度 = 321
    未央阁联盟 = 592
    枫叶字幕组 = 630
    楓雪連載製作 = 34
    幻之字幕组 = 430
    银色子弹字幕组 = 576
    东京不够热 = 526
    新番字幕组 = 672
    天空树双语字幕组 = 485
    追新番字幕组 = 651
    VRAINSTORM = 673
    银光字幕组 = 506
    梦星字幕组 = 552
    WOLF字幕组 = 141
    聖域字幕組 = 403
    小愿8压制组 = 705
    魯邦聯會 = 721
    动漫先锋 = 104
    NEO·QSW = 537
    AikatsuFans = 675
    VCBStudio = 581
    BBA字幕组 = 436
    KRL字幕组 = 228
    小花花同盟戰線 = 699
    AQUA工作室 = 217
    梦蓝字幕组 = 574
    鈴風字幕組 = 225
    萝莉社活动室 = 550
    A80v08 = 719
    LittleBakas = 638
    脸肿字幕组 = 568
    花園壓制組 = 563
    旋风字幕组 = 370
    漫藤字幕组 = 559
    省电Raws = 631
    华盟字幕社 = 49
    柯南事务所 = 75
    天香字幕社 = 110
    虐心发布组 = 690
    冷番补完字幕组 = 641
    雪梦字幕组 = 567
    Little字幕组 = 680
    乐园字幕组 = 723
    CentaureaRaws = 573
    自由字幕组 = 432
    AstralUnion字幕组 = 716
    魔星字幕团 = 648
    Vmoe字幕組 = 536
    NAZOrip = 697
    狐狸小宮 = 701
    囧夏发布组 = 507
    虚数学区研究协会 = 664
    AZT字幕组 = 717
    CureSub = 332
    钉铛字幕组 = 561
    SFEORaws = 652
    EggPainRaws = 541
    天空字幕组 = 453
    天の翼字幕汉化社 = 606
    紫音動漫發佈組 = 459
    星火字幕组 = 558
    驯兽师联盟 = 626
    BlueRabbit = 687
    夜莺工作室 = 394
    矢车菊影音工作室 = 505
    TenYun = 702


@unique
class 时序(Enum):
    發佈時間從後往前 = "date-desc"
    發佈時間從前往後 = "date-asc"
    相關度 = "rel"


@unique
class 动画(Enum):
    多罗罗 = 1
    多羅羅 = 2
    博人传 = 3
    博人傳 = 4


def 动漫花园走起(关键字=动画.多羅羅.name, 那个字幕组=字幕组.全部, 那个分类=分类.動畫):
    url = "https://share.dmhy.org/topics/rss/rss.xml"

    请求数据 = {
        "keyword": 关键字,
        "sort_id": 那个分类.value,
        "team_id": 那个字幕组.value,
        "order": 时序.發佈時間從前往後.value  # 时间排列?
    }

    返回数据 = 爬取(url, 请求数据)


    日期 = datetime.now().strftime("%Y%m%d")
    路径 = AirFile("/json/%s_%s.xml" % (日期, 关键字))
    路径.创建目录Ex()

    写出文件(路径.绝对路径, 返回数据, "w")



# 第一个参数是搜索关键字
# 第二个参数是字幕组 相关名称到nyaa查找


def nyaa走起(关键字="多羅羅", 用户名="U3-Web"):
    url = "https://nyaa.si"
    请求数据 = {
        "page": "rss",
        "u": 用户名,
        "q": 关键字,
    }

    返回数据 = 爬取(url, 请求数据)

    集数 = re.findall(r'<title>(.*)</title>', 返回数据)[1:]
    种子 = re.findall(r'<link>(.*)</link>', 返回数据)[1:]
    磁链 = re.findall(r'<nyaa:infoHash>(.*)</nyaa:infoHash>', 返回数据)

    服务器 = "&dn=%5BU3-Web%5D%20Dororo%20%2F%20%E3%81%A9%E3%82%8D%E3%82%8D%20%2F%20%E5%A4%9A%E7%BE%85%E7%BE%85%202019%20%5BEP15%5D%20%5BMulti-Subs%5D%20%5BAMZN%20WEB-DL%201080p%20AVC%20E-AC-3%5D&tr=http%3A%2F%2Fnyaa.tracker.wf%3A7777%2Fannounce&tr=udp%3A%2F%2Fopen.stealth.si%3A80%2Fannounce&tr=udp%3A%2F%2Ftracker.opentrackr.org%3A1337%2Fannounce&tr=udp%3A%2F%2Ftracker.coppersurfer.tk%3A6969%2Fannounce&tr=udp%3A%2F%2Fexodus.desync.com%3A6969%2Fannounce"

    arr = []
    for i in range(len(集数)):
        strTmp = "magnet:?xt=urn:btih:%s%s" % (磁链[i], 服务器)
        arr.append(
            {"集数": 集数[i], "种子": 种子[i], "磁链": strTmp}
        )

    日期 = datetime.now().strftime("%Y%m%d")
    路径 = AirFile("/json/%s_%s.json" % (日期, 关键字))
    路径.创建目录Ex()

    写出文件(路径.绝对路径, arr, "w")




if __name__ == '__main__':

    nyaa走起()
    # 动漫花园走起(动画.多羅羅.name, 字幕组.全部, 分类.動畫)
