package com.learn.testBean;

/**
 * 使用有参构造注入
 * Description: <br/>
 * date: 2020/7/6 20:56<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Orders {
    private String oName;
    private String oPrice;

    public void testDemo(){
        System.out.println(oName);
        System.out.println(oPrice);
    }

    public Orders(String oName, String oPrice) {
        this.oName = oName;
        this.oPrice = oPrice;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oName='" + oName + '\'' +
                ", oPrice='" + oPrice + '\'' +
                '}';
    }
}
