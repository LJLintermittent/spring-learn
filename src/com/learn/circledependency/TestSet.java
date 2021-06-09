package com.learn.circledependency;

import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 * date: 2021/4/18 21:48
 * Package: com.learn.circledependency
 *
 * @author 李佳乐
 * @version 1.0
 */
public class TestSet {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        AbstractAutowireCapableBeanFactory beanFactory = (AbstractAutowireCapableBeanFactory) context.getBeanFactory();
        beanFactory.setAllowCircularReferences(false);
        context.refresh();
        ServiceA serviceA = new ServiceA();
        ServiceB serviceB = new ServiceB();
        serviceA.setServiceB(serviceB);
        serviceB.setServiceA(serviceA);

    }
}
