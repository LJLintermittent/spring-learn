package com.learn.service;

import com.learn.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/7 15:42<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
//使用注解创建对象
//@Component(value = "orderService")
@Service(value = "orderService")
public class OrderService {
    @Value(value = "徐欣裕")
    private String name;
    //autowired : 根据类型进行注入
//    @Autowired
//    //根据名称注入
//    @Qualifier(value = "orderDaoImpl2")
//可以根据类型注入，也可以根据名称注入
    @Resource(name = "orderDaoImpl2")
    private OrderDao orderDao;

    public void add(){
        System.out.println("OrderService ......."+name);
        orderDao.add();
    }
}
