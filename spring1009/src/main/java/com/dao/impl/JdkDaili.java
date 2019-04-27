package com.dao.impl;

import com.dao.UsersDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//主要目的:创建代理对象,jdk代理只能用于被代理的接口

/**
 * 步骤：1  创建jdk代理对象，将代理对象插入进去，即为创建有参构造
 *      2 创建代理对象的方法，运用反射
 *      3 代理对象在调取目标方法时都会执行invoke方法，实现增强效果
 */
public class JdkDaili implements InvocationHandler {

    private UsersDao dao;//被代理的对象

     public JdkDaili(UsersDao dao){
         this.dao = dao;
     }

    //创建代理对象
    public  UsersDao createproxy(){
       UsersDao dao2= (UsersDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(),
                dao.getClass().getInterfaces(),this);
       return dao2;
    }

    //在代理对象调取目标方法时，都会执行invoke方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("功能开始。。。。。。");
        Object obj=  method.invoke(dao,args);//执行目标方法
        System.out.println("功能结束。。。。。。");
        return obj;
    }
}
