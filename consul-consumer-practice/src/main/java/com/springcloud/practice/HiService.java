package com.springcloud.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {

    @Autowired
    ClientFeign clientFeign;

    public String sayHi(String name) {
        return clientFeign.sayHi(name);
    }
}
