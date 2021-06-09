package com.learn.dao.impl;

import com.learn.dao.OrderDao;
import org.springframework.stereotype.Repository;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/7 16:07<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Repository(value = "orderDaoImpl2")
public class OrderDaoImpl2 implements OrderDao {
    @Override
    public void add() {
        System.out.println("222222222222222222");
    }
}
