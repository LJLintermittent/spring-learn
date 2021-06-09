package com.learn.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/8 10:36<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Component
@Aspect
@Order(3)
public class PeopleProxy {
    //相同切入点抽取
    @Pointcut(value = "execution(* com.learn.aopanno.People.add(..))")
    public void pointCut() {

    }

    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "pointCut()")
    public void before() {
        System.out.println("before.........");
    }

    //后置通知（返回通知）
    @AfterReturning(value = "pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning.........");
    }

    //最终通知
    @After(value = "pointCut()")
    public void after() {
        System.out.println("after.........");
    }

    //异常通知
    @AfterThrowing(value = "pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing.........");
    }

    //环绕通知
    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.........");
        //被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后.........");
    }

}
