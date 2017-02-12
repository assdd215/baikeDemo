package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

/**
 * Created by Aria on 2017/2/10.
 */

@Aspect
@Component
public class LogInterceptor {

    private final Logger logger = LoggerFactory.getLogger(LogInterceptor.class);

    @Before(value = "execution(*com.controller.*.*(..))")
    public void before(){
        System.out.println("login start");
        logger.info("login start");
    }

    @After(value = "execution(*com.controller.*.*(..))")
    public void after(){
        System.out.println("login end");
        logger.info("login end");
    }
}
