package com.learn.javaBean;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/7 9:53<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Emp {
    private String ename;
    private String gender;

    private Department department;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public void demo(){
        System.out.println(ename);
        System.out.println(gender);
        System.out.println(department);
    }
}
