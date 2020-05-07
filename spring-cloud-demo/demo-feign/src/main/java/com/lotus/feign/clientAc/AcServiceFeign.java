package com.lotus.feign.clientAc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client-ac", fallback = AcServiceFeignHystrix.class)
public interface AcServiceFeign {

    @GetMapping(value="/api/v1/lotus/ac")
    String getHelloFromAc(@RequestParam(value = "name")String name);

    //Feign自带断路器，只是在D版本的Spring Cloud之后，它没有默认打开
}
