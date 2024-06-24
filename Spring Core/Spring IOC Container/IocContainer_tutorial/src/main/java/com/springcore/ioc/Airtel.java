package com.springcore.ioc;

public class Airtel implements Sim{

    @Override
    public void calling() {
        System.out.println("Calling from Airtel Sim");
    }

    @Override
    public void internet() {
        System.out.println("Internet from Airtel Sim");
    }
}
