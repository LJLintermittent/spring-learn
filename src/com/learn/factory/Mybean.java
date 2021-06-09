package com.learn.factory;

import com.learn.collection.Course;
import com.learn.collection.Film;
import org.springframework.beans.factory.FactoryBean;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/7 10:52<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Mybean  implements FactoryBean<Course> {
    //定义返回bean的类型
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("java");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
