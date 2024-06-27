package com.springcore.aop;

public class PaymentService {

    /**
     * JoinPoint
     */
    public void makePayment() {
        System.out.println("Payment Transferred");

        System.out.println("Payment Received");
    }
}
