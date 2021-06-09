package com.learn.collection;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/7 10:31<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Course {
    private String cname;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
