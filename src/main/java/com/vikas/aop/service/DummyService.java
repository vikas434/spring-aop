package com.vikas.aop.service;

import com.vikas.aop.aop.LogExecutionTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DummyService {

    @LogExecutionTime
    public void dummyMethod() throws InterruptedException {
        Thread.sleep(2000);
        log.info("DummyService :: Dummy Method");
        System.out.println("It's a dummy method");
    }
}
