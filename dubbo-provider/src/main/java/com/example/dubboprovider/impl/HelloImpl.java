package com.example.dubboprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbointerface.service.HelloService;

@Service(timeout = 1000,version="1.0.0",interfaceClass = HelloService.class)
public class HelloImpl implements HelloService {
    @Override
    public String sayHello() {
        return "服务方提供的dubbo";
    }
}
