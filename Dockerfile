# Docker image for springboot application
# VERSION 0.0.1
# Author: bolingcavalry

### 基础镜像，使用alpine操作系统，openjkd使用8u201
FROM openjdk:8u201-jdk-alpine3.9

#作者
MAINTAINER BolingCavalry <zq2599@gmail.com>

RUN  mkdir -p /ams/logs

#系统编码
ENV LANG=C.UTF-8 LC_ALL=C.UTF-8

#声明一个挂载点，容器内此路径会对应宿主机的某个文件夹
#VOLUME /ams/logs

# 添加变量，如果使用dockerfile-maven-plugin，则会自动替换这里的变量内容
ARG JAR_FILE=target/demo.jar

# 往容器中添加jar包
ADD ${JAR_FILE} app.jar

#启动容器时的进程
ENTRYPOINT ["java","-jar","/app.jar"]

#暴露8080端口
EXPOSE 8080
