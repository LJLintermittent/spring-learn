package com.learn.proxy;

import com.learn.proxy.impl.PersonImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/7 22:04<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {Person.class};
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        PersonImpl person = new PersonImpl();
        Person person1 = (Person) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new PersonProxy(person));
        int result = person1.add(3, 2);
        String update = person1.update("1");
        System.out.println(result);
        System.out.println(update);
    }
}
//创建代理对象
class PersonProxy implements InvocationHandler{
    //有参构造传递
    private Object obj;
    public PersonProxy(Object obj){
        this.obj = obj;
    }

    //增强的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前执行
        System.out.println("方法之前执行"+method.getName()+":传递的参数"+ Arrays.toString(args));
        //被增强的方法执行
        Object o = method.invoke(obj, args);
        System.out.println("方法之后执行"+obj);
        return o;
    }
}
