package com.lotus.feign.clientAc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "client-ac")
public interface AcServiceFeign {

    @GetMapping(value="/api/v1/lotus/ac")
    String getHelloFromAc();
}
