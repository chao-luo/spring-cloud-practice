package com.springcloud.practice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String hi(@RequestParam(defaultValue = "consul", required = false) String name) {
        return hiService.sayHi(name);
    }
}
