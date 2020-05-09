package com.lotus.demo.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableHystrix
public class DemoRibbonApplication {

    // springcloud 有两种服务调用方式
    // 1. ribbon+restTemplate 消费服务
    // 2. feign 消费服务
    public static void main(String[] args) {
        SpringApplication.run(DemoRibbonApplication.class, args);
    }

    // @LoadBalanced注解表明这个restRemplate开启负载均衡的功能
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
