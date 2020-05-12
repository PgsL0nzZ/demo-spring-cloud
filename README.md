# demo-spring-cloud
The demo about spring cloud system

--2020-04-29--

1.eureka 服务发现， 
2.client 服务注册， 
3.feign/ribbon+restTemplate  服务负载均衡

--2020-05-07--

1.ribbon 熔断器hystrix， 
2.feign 自带熔断器，D版本后需自动打开

--2020-05-08--

1.zuul 网关路由配置，stripPrefix坑

2.spring-cloud-netflix-eureka-client 并不包含ribbon的引用，
因为eureka和ribbon是两个独立的组件，是独立的包,
故使用spring-cloud-starter-netflix-eureka-client包

3.zuul 过滤器的应用，返回值的处理

--2020-05-12--

1.config-server ，配置中心的配置方式有 3种：git(https://)系统相对路径(classpath),文件系统(file:///)

2.config-server http请求直接获取相应资源的方式有 5种

3.config-server 拓展bootstrap,profile定义配置文件类型有 3种：pro(生产环境),dev(开发环境),test(测试环境)

4.eureka-client 集成config-client



