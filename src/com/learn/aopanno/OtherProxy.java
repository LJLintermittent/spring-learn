package com.learn.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/8 10:02<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Component
@Aspect
@Order(1)
public class OtherProxy {
    @Before(value = "execution(* com.learn.aopanno.People.add(..))")
    public void otherBefore(){
        System.out.println("other before.....");
    }
}
