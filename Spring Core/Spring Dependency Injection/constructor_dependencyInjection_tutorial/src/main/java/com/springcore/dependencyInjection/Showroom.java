package com.springcore.dependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Showroom {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean("tataCar", Car.class);
        System.out.println(car);
    }
}
