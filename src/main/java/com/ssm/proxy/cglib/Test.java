package com.ssm.proxy.cglib;

import com.ssm.proxy.TargetInterface;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Targer targer = new Targer();
        Advice advice = new Advice();

        //1.创建增强器
        Enhancer enhancer = new Enhancer();
        //2.设置父类(目标)
        enhancer.setSuperclass(targer.getClass());
        //3.设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                advice.beforeAdvice();
                Object invoke = method.invoke(targer, args);
                advice.afterAdvice();
                return invoke;
            }
        });
        //4.创建代理对象
        Targer proxy = (Targer) enhancer.create();

        proxy.save();
    }
}
