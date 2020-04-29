package com.lotus.client.ac.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/lotus/ac")
public class HomeController {

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String name;

    @GetMapping("")
    public String home(){
        return this.name+":"+this.port;
    }

}
