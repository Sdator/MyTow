
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <errno.h>
//#include <sys/socket.h>
//#include <arpa/inet.h>
#include <sys/types.h>
#include <pthread.h>
 
#define MAX_THREAD_NUM 100
#define SEG_LEN 655
#define MAX_PORT 65535
 /*
typedef struct PortNode
{
    char ip[30];
    int minPort;
    int maxPort;
}PortNode;
pthread_t tid;
void* doit(void* arg)
{
    int i, sockfd, connfd;
    struct sockaddr_in servaddr;
    PortNode* port = (PortNode*)arg;
    pthread_detach(pthread_self());//为避免存储器泄漏，每个可结合线程都应该被其他线程显式地收回，要么通过调用pthread_detach函数被分离
    memset(&servaddr, 0, sizeof(servaddr));
    servaddr.sin_family = AF_INET;
    //inet_pton(AF_INET, port->ip, &servaddr.sin_addr);
    servaddr.sin_addr.s_addr = inet_addr(port->ip);
    for(i = port->minPort; i <= port->maxPort; i++){
        servaddr.sin_port = htons(i);
        if((sockfd = socket(AF_INET, SOCK_STREAM, 0)) < 0){
            perror("socket error");
            pthread_exit(NULL);
        }
        if(connect(sockfd, (struct sockaddr *)&servaddr, sizeof(struct sockaddr)) == 0){
            printf("%s:%d\n", port->ip, i);
        }
        close(sockfd);//注意关闭！！
    }
    pthread_exit(NULL);
}
 */
 
int main(int argc, char** argv)
{
 
    /*
    int i,j;
    for(i = 1; i < argc; i++){
        //申请一段大小为PortNode结构体所占用空间的内存
        //把这段空间的类型转为PortNode结构体
        PortNode* port = (PortNode*)malloc(sizeof(PortNode));
        //获取最大线程数做计次循环
        for(j = 0; j < MAX_THREAD_NUM; j++){
            //把命令行参数赋值给结构体中的ip
            strcpy(port->ip, argv[i]);
            //设置结构体minPort的值为当前次数*段长（数据段中包括的字节数）+1     
            port->minPort = j*SEG_LEN + 1;
            //如果进程次数等于最大进程次数减一
            //设置结构体最大端口的值为最大端口数量
            if(j == (MAX_THREAD_NUM - 1))port->maxPort = MAX_PORT;
            else port->maxPort = port->minPort + SEG_LEN - 1;
            if(pthread_create(&tid, NULL, doit, (void*) port)  != 0 ){
                perror("pthread create error.\n");
                free(port);
                port=NULL;
                exit(1);
            }
        }
    }
    sleep(3);
    */
}