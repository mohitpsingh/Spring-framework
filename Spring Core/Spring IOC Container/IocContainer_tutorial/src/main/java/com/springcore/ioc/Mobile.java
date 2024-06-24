package com.springcore.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.close();
    }
}
