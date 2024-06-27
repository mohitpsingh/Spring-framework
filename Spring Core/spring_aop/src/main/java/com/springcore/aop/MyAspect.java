package com.springcore.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Aspect annotation is used to declare the class as Aspect class
 */
@Aspect
public class MyAspect {

    /**
     * @Before used to add the Service before the actual service
     * execution() takes the parameters of package.Class.Method()
     * asterisk represent all
     */
    @Before("execution(* com.springcore.aop.PaymentService.makePayment())")
    public void beforeMessage() {
        System.out.println("Payment Initiated..");
    }

    /**
     * @After used to add the Service after the actual service
     */
    @After("execution(* com.springcore.aop.PaymentService.makePayment())")
    public void afterMessage() {
        System.out.println("Payment Ended..");
    }
}
