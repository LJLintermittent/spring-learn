package com.learn.aopanno;

import org.springframework.stereotype.Component;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/8 10:35<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
//被增强的类
@Component
public class People {
    public void add(){
//        int i = 10/0;
        System.out.println("add.......");
    }
}
