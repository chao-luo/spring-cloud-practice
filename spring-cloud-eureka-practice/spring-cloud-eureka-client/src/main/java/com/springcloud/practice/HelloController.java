package com.springcloud.practice;


import brave.Tracer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @Autowired
    Tracer tracer;

    @GetMapping("/hi")
    public String hi(@RequestParam String name)
    {
        tracer.currentSpan().tag("name", "chao");
        return "hi " + name + ", port: " + port;
    }
}
