package com.example.dubbocli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hjr
 * @Date: 2019/1/2 16:54
 */
@RestController
@RequestMapping("/home")
public class homeController {

    @Autowired
    testServer testServer1;
    @RequestMapping("/test")
    public String test(){
        return testServer1.test();
    }
}
