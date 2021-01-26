package com.springcloud.practice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "consul-provider")
public interface ClientFeign {

    @GetMapping(value = "/hi")
    String sayHi(@RequestParam(value = "name") String name);
}
