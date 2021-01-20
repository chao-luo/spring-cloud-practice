package com.springcloud.practice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("/testRibbon")
    public String hi(@RequestParam(defaultValue = "test", required = false) String name) {
        return ribbonService.sayHi(name);
    }
}
