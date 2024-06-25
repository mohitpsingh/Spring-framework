package com.springcore.dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Car tataCar() {
        return new Car("Tata");
    }

    @Bean
    public Car toyotaCar() {
        return new Car("Toyota", 23222);
    }
}
