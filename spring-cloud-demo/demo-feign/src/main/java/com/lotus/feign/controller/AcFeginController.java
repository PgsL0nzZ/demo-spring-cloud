package com.lotus.feign.controller;

import com.lotus.feign.clientAc.AcServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/lotus/feign")
public class AcFeginController {

    @Autowired
    AcServiceFeign acServiceFeignHystrix;

    @GetMapping("")
    public String getHello(){
        return acServiceFeignHystrix.getHelloFromAc("xiaoMing");
    }

}
