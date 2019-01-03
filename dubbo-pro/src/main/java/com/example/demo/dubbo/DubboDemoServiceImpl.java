package com.example.demo.dubbo;


import com.alibaba.dubbo.config.annotation.Service;


@Service
public class DubboDemoServiceImpl implements DubboDemoService{
    @Override
    public void say(String words) {
        System.out.println("##############" + words);
    }

    @Override
    public String info(String content) {
        return "$$$$$$$$$$$$".concat(content);
    }
}
