package com.learn.collection;

import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/7 10:39<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Film {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }
    public void show(){
        System.out.println(list);
    }
}
