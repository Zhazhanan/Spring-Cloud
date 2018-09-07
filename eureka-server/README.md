# 微服务注册与发现

Eureka是Netflix开源的服务发现组件，本身是一个基于REST的服务。它包含Server和Client两部分。  
## **实践**  
Server端  
1.pom文件引入spring-cloud-starter-netflix-eureka-server  
2.启动类加入注解@EnableEurekaServer

## **建议**
为保证系统稳定，建议集群部署