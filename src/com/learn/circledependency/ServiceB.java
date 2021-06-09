package com.learn.circledependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description:
 * date: 2021/4/18 21:49
 * Package: com.learn.circledependency
 *
 * @author 李佳乐
 * @version 1.0
 */
@Component("ServiceB")
//@Scope(scopeName = "singleton")
public class ServiceB {
    @Autowired
    private ServiceA serviceA;

    public ServiceB(){
//        System.out.println("ServiceB初始化完成");
    }

    public void setServiceA(ServiceA serviceA){
        this.serviceA = serviceA;
        System.out.println("B里面注入A成功");

    }
}
