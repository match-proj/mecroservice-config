# mecroservice-config


```$xslt 
创建网卡  microservice-network
docker network create -d bridge microservice-network

容器启动命令
docker run -d -p 7001:7001 --name microservice-config --network microservice-network  registry.cn-hangzhou.aliyuncs.com/match-hub/microservice-config:1.0


在其他容器访问当前容器 
curl http://microservice-config
ping   microservice-config
```