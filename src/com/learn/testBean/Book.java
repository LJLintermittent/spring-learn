package com.learn.testBean;

/**
 * 使用set方法注入属性
 * Description: <br/>
 * date: 2020/7/6 20:44<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Book {
    private String bName;
    private String bAuthor;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public void testDemo(){
        System.out.println("bName:"+bName+",bAuthor:"+bAuthor+",address:"+address);
    }
}
