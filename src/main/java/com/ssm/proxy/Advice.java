package com.ssm.proxy;

public class Advice {
    public void beforeAdvice(){
        System.out.println("before running........");
    }

    public void afterAdvice(){
        System.out.println("after running.........");
    }
}
