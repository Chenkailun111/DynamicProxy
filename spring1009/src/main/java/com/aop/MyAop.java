package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAop {

    //定义一个无返回值方法
    @Pointcut("execution(* com.service.impl.*.*(..))")
    public void abc(){}
    //@Around  @Before
    //@AfterReturning @AfterThrowing @After
    //需要在目标方法调取之前调用-前置增强
    //获得目标方法的信息
    @Before("abc()")
    public  void qianzhi(JoinPoint joinPoint){
        System.out.println("方法开始执行....spring");
        System.out.println("切入的方法:"+joinPoint.getSignature());
        System.out.println("切入的对象:"+joinPoint.getTarget().getClass());
       Object[] args= joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("切入点参数:"+arg);
        }
    }

    //需要在目标方法调取之后执行-后置增强
    @AfterReturning("abc()")
    public void houzhi(){
        System.out.println("方法结束执行。。。spring");
    }
    //异常增强:当遇到异常时，才会执行的增强代码
    public  void yichang(){
        System.out.println("遇到了异常");
    }
    //最终增强:无论是否有异常，都要执行
    public void zuizhong(){
        System.out.println("必须执行的增强代码");
    }
    //环绕增强:等价于开始+结束
    public  void huanrao(ProceedingJoinPoint jp) throws  Throwable{
        System.out.println("环绕开始。。。。");
        jp.proceed();//执行后续操作
        System.out.println("环绕结束。。。。");
    }
}
