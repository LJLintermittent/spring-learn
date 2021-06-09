package com.learn.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/7 11:21<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Order {
    private String oname;

    public Order() {
        System.out.println("执行无参构造，创建bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("调用set方法，设置属性值");
    }
    //创建执行初始化方法
    public void init(){
        System.out.println("执行初始化方法");
    }
    //创建销毁方法
    public void destroy(){
        System.out.println("执行销毁方法");
    }

}
