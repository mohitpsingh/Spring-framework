package com.spingcore.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClassRoom {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student s = context.getBean("getStudent", Student.class);
        s.checkStudent();
    }
}
