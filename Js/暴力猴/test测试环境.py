import http.server as http
import os
from functools import partial
'''
利用 http.server 实验的服务器

可修改相应头 相应数据的服务 

'''

class 重写服务(http.SimpleHTTPRequestHandler):
    # 相应头
    def send_response(self, code, message=None):
        self.log_request(code)
        self.send_response_only(code, message)
        self.send_header('Server', self.version_string())
        self.send_header('Date', self.date_time_string())
        # 设置缓存的有效时长，单位为秒。可用在请求头和响应头中
        # self.send_header('Cache-Control', "no-store,no-cache")
        # self.send_header('Cache-Control', "max-age=2")
        self.send_header('Cache-Control', "max-age=2,no-cache")
        # 允许跨域访问
        self.send_header('Access-Control-Allow-Origin', "*")

        print(code, message)

    def do_GET(self):
        # 当get获取页面时 返回请求内容到客户端
        f = self.send_head()
        
        if f:
            try:
                self.copyfile(f, self.wfile)
            finally:
                f.close()


def main():
    handler_class = partial(重写服务, directory=os.getcwd())

    http.test(
        HandlerClass=handler_class,
        ServerClass=http.ThreadingHTTPServer,
        port=8000)


if "__main__" == __name__:
    main()
