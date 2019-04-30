# -*- coding: utf-8 -*-

import os
import requests
import json
from datetime import datetime
import base64


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
        os.makedirs(绝对目录.取路径)

# dsfdsf
def 写出文件(路径, data, 读写方式 = "a"):
    """`参数1` 写出路径

    `参数2` 写出的数据

    `参数3` 读写方式 默认为追加模式
    """
    # 打开文件
    with open(路径, 读写方式, encoding="utf-8") as f:
        # 转到字符串
        data = json.dumps(data, ensure_ascii=False)+"\n"
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
            "http": "http://127.0.0.1:14566",
            "https": "http://127.0.0.1:14566",
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
