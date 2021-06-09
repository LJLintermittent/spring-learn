package com.learn.dao.impl;

import com.learn.dao.OrderDao;
import org.springframework.stereotype.Repository;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/7 15:55<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Repository(value = "orderDaoImpl")
public class OrderDaoImpl implements OrderDao {
    @Override
    public void add() {
        System.out.println("OrderDao add.........");
    }
}
