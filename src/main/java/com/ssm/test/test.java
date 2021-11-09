package com.ssm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
       ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] names = app.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }
}
