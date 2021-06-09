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
@Component("ServiceA")
//@Scope(scopeName = "singleton")
public class ServiceA {
    @Autowired
    private ServiceB serviceB;

    public ServiceA(){
//        System.out.println("ServiceA初始化完成");
    }

    public void setServiceB(ServiceB serviceB){
        this.serviceB = serviceB;
        System.out.println("A里面注入B成功");
    }



}
