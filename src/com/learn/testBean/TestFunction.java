package com.learn.testBean;

import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.lang.Nullable;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/9 18:43<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class TestFunction {
    //表示属性或方法或参数可以为空的注解
    @Nullable
    private String username;
    //函数式风格创建对象
    @Test
    public void testGenericApplicationContext(){
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        context.registerBean("function",Function.class,() -> new Function());
        Function fun = (Function) context.getBean("function");
        System.out.println(fun);


    }
}
