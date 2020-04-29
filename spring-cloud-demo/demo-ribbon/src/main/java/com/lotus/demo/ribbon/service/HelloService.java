package com.lotus.demo.ribbon.service;

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


}
