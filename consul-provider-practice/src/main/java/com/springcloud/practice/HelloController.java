package com.springcloud.practice;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @Value("${foo.bar}")
    String bar;

    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return "hi " + name + ", port: " + port;
    }

    @GetMapping("/foo")
    public String foo() {
        return bar;
    }
}
