package com.vikas.aop.controller;

import com.vikas.aop.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @Autowired
    DummyService dummyService;

    @GetMapping("/")
    public String helloWorld() throws InterruptedException {
        dummyService.dummyMethod();
        return "Hello world!";
    }
}
