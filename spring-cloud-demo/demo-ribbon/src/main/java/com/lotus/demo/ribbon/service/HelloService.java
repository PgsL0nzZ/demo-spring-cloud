package com.lotus.demo.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(){
        return restTemplate.getForObject("http://client-ac/api/v1/lotus/ac", String.class);
    }

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService_hystrix(String name){
        return restTemplate.getForObject("http://client-ac/api/v1/lotus/ac",String.class);
    }

    //测试熔断
    public String hiError(String name){
        return "sorry,"+name+",server is down!";
    }


}
