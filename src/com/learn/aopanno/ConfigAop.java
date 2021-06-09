package com.learn.aopanno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/8 10:26<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
//完全注解开发
@Configuration
@ComponentScan(basePackages = {"com.learn"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
