package com.learn.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/7 11:42<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class BeanPost  implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之前执行的方法（后置处理器）");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之后执行的方法（后置处理器）");
        return bean;

    }
}
