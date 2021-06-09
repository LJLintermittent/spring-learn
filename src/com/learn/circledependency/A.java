package com.learn.circledependency;



/**
 * Description:
 * date: 2021/4/18 21:54
 * Package: com.learn.circledependency
 *
 * @author 李佳乐
 * @version 1.0
 */
public class A {
    private B b;

    public A(){
        System.out.println("A创建成功");
    }
    public void setB(B b){
        this.b = b;
    }
}
