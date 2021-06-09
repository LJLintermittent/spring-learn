package com.learn.circledependency;

/**
 * Description:
 * date: 2021/4/18 21:54
 * Package: com.learn.circledependency
 *
 * @author 李佳乐
 * @version 1.0
 */
public class B {
    private A a;

    public B(){
        System.out.println("B创建成功");
    }
    public void setA(A a){
        this.a = a;
    }
}
