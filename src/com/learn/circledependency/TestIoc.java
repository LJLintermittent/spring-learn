package com.learn.circledependency;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 * date: 2021/4/18 21:56
 * Package: com.learn.circledependency
 *
 * @author 李佳乐
 * @version 1.0
 */

//循环依赖   DefaultSingletonBeanRegistry

/**
 * A,B两个对象在三级缓存中的迁移说明：
 * <p>
 * 1. A创建过程中，需要使用到B，于是A将自己放到三级缓存中，去实例化B
 * 2. B实例化的过程中 (B也先将自己放到三级缓存中) ，需要A，于是B先在一级缓存中查找A，没有 ，再查找二级缓存，还是没有，再查找三级缓存，
 * 在三级缓存里面找到了A，然后把三级缓存里的A放到二级缓存，然后从三级缓存中删除A
 * 3. B初始化完成后将B本身放到一级缓存中，此时B里面的A仍然是创建中的状态，也就是实例化完成，但并未完成初始化。
 * 接着回去创建A，此时B已经创建完成，直接从一级缓存里面拿到B，然后完成A的创建，并将A自己放到一级缓存中、
 * <p>
 * <p>
 * singletonObjects  一级缓存  concurrentHashmap
 * earlySingletonObjects 二级缓存  hashmap
 * singletonFactories 三级缓存  hashmap
 *
 * circledependency.xml
 */
public class TestIoc {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("circledependency.xml");

//        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        A a = context.getBean("a", A.class);
        B b = context.getBean("b", B.class);

    }
}
