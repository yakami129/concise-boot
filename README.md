# 工程简介

该项目是一个简洁的springcloud微服务架构脚手架，目的是为了减轻从0到1的架构搭建成本

它具备以下功能：

1. 一键构建和部署
2. 配置版本管理
3. SQL版本管理
4. 快速搭建新服务

### 该项目的结构说明

1. config-init : nacos配置初始化和版本管理
2. db-migration: SQL版本迭代管理
3. domain-example: 示例项目
4. domain-example: 项目demo
5. library-infrastructure: 基础设施-核心包，用于管理项目中所有的公共配置初始化
6. library-infrastructure-common：基础设施-公共包，用于存放公共的bean和异常类
7. library-infrastructure-rpc：基础设施-grpc包，用于管理项目中的grpc接口
8. library-testing：基础设施-单元测试包，用于存放与单元测试相关的工具
9. operating-config：运维部署-镜像构建配置，用于管理docker构建配置和环境变量
10. operating-logs：系统日志存放处
11. operating-packaging：运维部署-dockerfile编排文件
12. platform-gateway：统一API网关
13. platform-security：统一权限管理(开发中)


### 该项目使用了哪些技术栈

1. 配置中心/注册中心：nacos
2. 远程调用框架：dubbo
3. API网关： spring cloud gateway
4. 服务框架：spring cloud 、spring boot
5. 持久层框架：mybatis plus

# 延伸阅读

## 快速开始

### （1）本地开发环境启动

```
## 只会启动中间件，不会启动服务
sh start-local.sh

## 关闭本地开发环境
sh stop-local.sh
```

### （2）一键发布

```
## 1. 构建项目
sh build.sh

## 2. 启动项目
sh start-prod.sh

## 3. 关闭项目
sh stop-prod.sh
```