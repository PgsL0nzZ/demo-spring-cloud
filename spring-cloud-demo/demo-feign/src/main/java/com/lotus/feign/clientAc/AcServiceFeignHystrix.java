package com.lotus.feign.clientAc;

import org.springframework.stereotype.Component;

@Component  //注入到ioc容器内
public class AcServiceFeignHystrix implements AcServiceFeign {

    @Override
    public String getHelloFromAc(String name) {
        return "sorry,"+name+",server is down!";
    }
}
