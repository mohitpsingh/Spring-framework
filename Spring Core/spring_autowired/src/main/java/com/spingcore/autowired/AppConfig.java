package com.spingcore.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student getStudent() {
        return new Student();
    }

    @Bean
    public ScienceStudent getScienceStudent() {
        return new ScienceStudent();
    }

    @Bean
    public ArtsStudent getArtsStudent() {
        return new ArtsStudent();
    }

    @Bean
    public CommerceStudent getCommerceStudent() {
        return new CommerceStudent();
    }
}
