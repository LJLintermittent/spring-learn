package com.learn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/7 16:19<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
//配置类 ，替代配置文件
@Configuration
@ComponentScan(basePackages = {"com.learn"})
public class SpringConfig {
}
