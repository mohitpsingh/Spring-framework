package com.springcore.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @EnableAspectJAutoProxy Enables support for handling components marked with
 * AspectJ's @Aspect annotation
 */
@Configuration("AppConfig")
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public PaymentService payment() {
        return new PaymentService();
    }

    @Bean
    public MyAspect myAspectBean() {
        return new MyAspect();
    }
}
