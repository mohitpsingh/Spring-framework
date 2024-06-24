package com.springcore.dependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Life {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = context.getBean("getPersonInfo", Person.class);
        System.out.println(person);
        context.close();
    }

}
