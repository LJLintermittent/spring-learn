package com.learn.service;

import com.learn.dao.UserDao;
import com.learn.dao.impl.UserDaoImpl;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/6 21:37<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public  void add(){
        System.out.println("service add......");
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();
        userDao.update();

    }
}
