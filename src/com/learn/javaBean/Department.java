package com.learn.javaBean;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/7 9:51<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Department {
    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
