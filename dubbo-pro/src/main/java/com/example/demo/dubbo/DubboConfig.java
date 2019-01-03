package com.example.demo.dubbo;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:provider.xml"})
public class DubboConfig {

}
