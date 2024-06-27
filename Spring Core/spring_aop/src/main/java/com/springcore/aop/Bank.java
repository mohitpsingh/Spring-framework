package com.springcore.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Bank {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PaymentService pay = context.getBean("payment", PaymentService.class);
        pay.makePayment();
    }
}
