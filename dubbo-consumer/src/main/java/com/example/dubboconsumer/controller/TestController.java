package com.example.dubboconsumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbointerface.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController  {

    @Reference(version = "1.0.0")
    public HelloService helloService;


    @RequestMapping("/demo")
    public String demo(){
        return helloService.sayHello();
    }
}
