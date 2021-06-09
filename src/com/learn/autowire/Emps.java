package com.learn.autowire;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/7 13:53<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Emps {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emps{" +
                "dept=" + dept +
                '}';
    }
    public void test(){
        System.out.println(dept);
    }
}
