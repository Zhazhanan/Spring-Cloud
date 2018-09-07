# 微服务分布式配置中心

方便服务配置文件统一管理，更易于部署、维护，springCloudConfig，它支持配置文件放在在配置服务的内存中，也支持放在远程Git仓库里。它包含Server和Client两部分  
## **实践**  
### Server端  
1.pom文件引入spring-cloud-config-server  
2.启动类加入注解@EnableConfigServer
3.配置文件增加远程仓库地址  
4.启动测试是否可以访问远程文件  
  
  **http请求地址和资源文件映射如下**:
* /{application}/{profile}[/{label}] 
* /{application}-{profile}.yml 
* /{label}/{application}-{profile}.yml 
* /{application}-{profile}.properties 
* /{label}/{application}-{profile}.properties
### Client端
1.pom文件引入spring-cloud-starter-config  
2.创建文件bootstrap.yml并配置远程仓库信息


## 参考资料
https://cloud.spring.io/spring-cloud-static/spring-cloud-config/1.4.0.RELEASE/single/spring-cloud-config.html  
http://cloud.spring.io/spring-cloud-static/Camden.SR7/#_environment_repository

## **建议**
为保证系统稳定，建议Server端集群部署