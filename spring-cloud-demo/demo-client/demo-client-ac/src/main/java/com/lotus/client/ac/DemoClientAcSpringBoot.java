package com.lotus.client.ac;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class DemoClientAcSpringBoot {

    public static void main(String[] args) {
        log.info("启动认证中心...");
        SpringApplication.run(DemoClientAcSpringBoot.class, args);
        log.info("成功启动认证中心...");
    }

}
