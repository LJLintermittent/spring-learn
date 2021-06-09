package com.learn.dao.impl;

import com.learn.dao.UserDao;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/6 21:38<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void update() {
        System.out.println("dao update.....");
    }
}
