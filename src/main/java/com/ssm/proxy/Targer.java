package com.ssm.proxy;

public class Targer implements TargetInterface {
    @Override
    public void save() {
        System.out.println("save running..........");
    }
}
