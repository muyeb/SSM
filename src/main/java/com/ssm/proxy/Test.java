package com.ssm.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Targer targer = new Targer();
        Advice advice = new Advice();
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(
                targer.getClass().getClassLoader(),
                targer.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        advice.beforeAdvice();
                        Object invoke = method.invoke(targer, args);
                        advice.afterAdvice();
                        return invoke;
                    }
                }
        );

        proxy.save();

    }
}
