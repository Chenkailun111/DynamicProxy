package com.bean;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//创建Users实体类的代理类对象

/**
 * cglib代理： 可以创建普通类代理的动态代理
 *   1  创建有参构造。
 *   2  创建代理对象的方法。
 *   3  调取目标方法都会执行的方法，在这个方法里实现增强的功能。
 */
public class UsersProxy  implements MethodInterceptor {

    private Users user;
    public UsersProxy(Users user){
        this.user=user;
    }

    public  Users createUsersProxy(){
        Enhancer en=new Enhancer();//创建代理对象
        en.setSuperclass(user.getClass());//传入被代理的类
        en.setCallback(this);//设置回调函数
        //创建代理对象
        return  (Users) en.create();
    }


    //调取目标方法，都会执行这个方法
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法开始执行111111");
        Object obj= methodProxy.invokeSuper(o,objects);
        System.out.println("方法结束执行222222");
        return obj;
    }
}
