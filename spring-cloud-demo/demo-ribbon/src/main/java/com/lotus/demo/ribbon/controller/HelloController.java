package com.lotus.demo.ribbon.controller;

import com.lotus.demo.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/lotus/ribbon")
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("")
    public String hi(){
        return helloService.hiService_hystrix("xiaoMing");
    }

}
