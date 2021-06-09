package com.learn.proxy.impl;

import com.learn.proxy.Person;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/7 22:02<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class PersonImpl implements Person {

    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了");
        return id;
    }
}
