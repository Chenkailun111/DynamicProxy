package com.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Begin implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o)
            throws Throwable {
        System.out.println("advice前置");
        System.out.println("method="+method);
        System.out.println("参数:"+objects[0]);
        System.out.println("对象:"+o);
    }
}
