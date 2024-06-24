package com.springcore.ioc;

public class Idea implements Sim{

    @Override
    public void calling() {
        System.out.println("Calling from Idea Sim");
    }

    @Override
    public void internet() {
        System.out.println("Internet from Idea Sim");
    }
}
