# -*- coding: utf-8 -*-

import os
import requests
import json
from datetime import datetime
import base64
import urllib.parse


class AirFile:

    def __init__(self, path):
        self.__path = path

    @property
    def 取文件名(self):
        return os.path.basename(self.__path)

    @property
    def 是否绝对路径(self):
        return os.path.isabs(self.__path)

    @property
    def 文件是否存在(self):
        return os.path.isfile(self.取路径)

    @property
    def 路径是否存在(self):
        return os.path.exists(self.__path)

    @property
    def 目录是否存在(self):

        return os.path.isdir(self.取路径)

    @property
    def 构造绝对路径(self):
        return os.path.abspath(self.__path)

    @property
    def 绝对路径(self):

        path = AirFile(self.获取工作目录 + self.__path)
        return path.构造绝对路径

    @property
    def 获取工作目录(self):
        return os.getcwd()

    @property
    def 取路径(self):
        return os.path.dirname(self.__path)

    def 创建目录Ex(self):
        绝对目录 = AirFile(self.绝对路径)

        if 绝对目录.目录是否存在:
            return
        #创建目录
        os.makedirs(绝对目录.取路径)




def 写出文件(关键字, data, 读写方式="a"):
    """`参数1` 写出路径

    `参数2` 写出的数据

    `参数3` 读写方式 默认为追加模式
    """
    # 构建命名规则
    日期 = datetime.now().strftime("%Y%m%d")
    路径 = AirFile("/json/%s_%s.json" % (日期, 关键字))
    路径.创建目录Ex()


    # 如果不是字符串就转码
    if not isinstance(data, str):
        data = json.dumps(data, ensure_ascii=False)+"\n"

    # 打开文件
    with open(路径.绝对路径, 读写方式, encoding="utf-8") as f:
        # 写到文件
        f.write(data)


def 爬取(提交地址, 请求数据, 返回格式="str", 是否使用代理=0):
    """`参数1` 提交地址

    `参数2` 请求数据

    `参数3` 返回格式 `str`返回文本格式，`json`返回字典对象  `默认为返回文本`

    `参数3` 是否使用代理 `0`=不使用, `1`=使用 开启后需要自己设置一下梯子的相关IP和端口 `默认为不使用`
    """

    代理 = ""

    if 是否使用代理:
        # 你的梯子
        代理 = {
            "http": "http://127.0.0.1:18888",
            "https": "http://127.0.0.1:18888",
        }

    # 提交地址 不要这么明显
    请求头 = {
        'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36'}
    # 访问网站
    r = requests.get(提交地址, params=请求数据, headers=请求头, proxies=代理)

    # 返回文本类型还是json
    sTmp = ""
    if 返回格式 == "str":
        sTmp = r.text
    else:
        sTmp = r.json()

    return sTmp


class 吉吉儿不放假:
    返回数据 = []
    页数 = 0
    i = 0
    @property
    def __递增页数(self):
        self.页数 += 1
        return self.页数

    @property
    def __递增(self):
        self.i += 1
        return self.i

    @property
    def 提交数据(self):
        return {'page': self.__递增页数, 'userid': 10029, 'ddh': 'vA8RVMNwA2'}

    @property
    def url(self):
        # 提交地址 不要那么明显
        url = base64.b64decode(
            b'aHR0cCUzQS8vbi4yeHd0NzUuY24vaW5kZXgucGhwL2luZGV4L2luZGV4L2hlemkuaHRtbA==')
        url = str(url, 'utf8')
        url = urllib.parse.unquote(url)
        # http://n.2xwt75.cn/index.php/index/index/hezi.html  已失效
        url = "http://gt57jip.cn/index.php/index/index/hezi.html"
        return url

    def __init__(self):
        self.获取()

    def __str__(self):
        return json.dumps(self.返回数据, ensure_ascii=False)

    # def data(self, *data):
    #     print(data)

    def 获取(self):
        # 访问网站
        返回数据 = 爬取(self.url, self.提交数据, "json")

        # 如果数据不存在返回  自动提取所有数据为止
        if not 返回数据:
            return

        # 用来保存需要的数据
        data = {}
        for v in 返回数据:
            print(v["id"])
            # 关联需要的数据
            data["序号"] = self.__递增
            data["url"] = v["url"]
            data["id"] = v["id"]
            data["date"] = v["shijian"]
            data["name"] = v["name"]

            self.返回数据.append(data.copy())
        # 递归
        self.获取()
