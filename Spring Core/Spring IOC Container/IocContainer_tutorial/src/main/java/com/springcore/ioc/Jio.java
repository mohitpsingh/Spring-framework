package com.springcore.ioc;

public class Jio implements Sim{

    @Override
    public void calling() {
        System.out.println("Calling from Jio Sim");
    }

    @Override
    public void internet() {
        System.out.println("Internet from Jio Sim");
    }
}
