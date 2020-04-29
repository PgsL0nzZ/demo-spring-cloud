package com.lotus.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoEurekaApplication {

    // eureka没有后端缓存，每一个实例注册之后需要向注册中心发送心跳，可在内存中完成
    // eureka server实际上也是个client,故必须指定server,但不必自我注册
    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaApplication.class, args);
    }

}
