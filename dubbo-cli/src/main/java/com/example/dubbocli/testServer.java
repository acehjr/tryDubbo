package com.example.dubbocli;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.dubbo.DubboDemoService;
import org.springframework.stereotype.Service;

/**
 * @Author: hjr
 * @Date: 2019/1/2 17:34
 */
@Service
public class testServer {
    @Reference
    private DubboDemoService dubboDemoService;

    public String test(){
        return dubboDemoService.info("123");
    }
}
