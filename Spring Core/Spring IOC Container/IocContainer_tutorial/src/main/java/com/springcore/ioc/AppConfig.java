package com.springcore.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    /**
     * @Bean is used for creating bean
     */
    @Bean
    public Airtel airtelSim() {
        Airtel airtel = new Airtel();
        airtel.calling();
        return airtel;
    }

    @Bean
    public Jio jioSimCalling() {
        Jio jio = new Jio();
        jio.calling();
        return jio;
    }

    @Bean
    public Jio jioSimInternet() {
        Jio jio = new Jio();
        jio.internet();
        return jio;
    }

    @Bean
    public Idea ideaSimInternet() {
        Idea idea = new Idea();
        idea.internet();
        return idea;
    }
}
