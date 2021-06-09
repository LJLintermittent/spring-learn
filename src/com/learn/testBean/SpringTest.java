package com.learn.testBean;

import com.learn.aopanno.People;
import com.learn.aopxml.Runner;
import com.learn.autowire.Emps;
import com.learn.bean.Order;
import com.learn.collection.Course;
import com.learn.collection.Film;
import com.learn.collection.Student;
import com.learn.config.SpringConfig;
import com.learn.javaBean.Emp;
import com.learn.service.OrderService;
import com.learn.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/6 19:39<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class SpringTest {
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }
    @Test
    public void testOrders(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.testDemo();
    }
    @Test
    public void testBean2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    public void testBean3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.demo();
    }
    @Test
    public void testCollection1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Student student = context.getBean("student", Student.class);
        student.show();
    }
    @Test
    public void testCollection2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
//        Film film = context.getBean("film", Film.class);
        Film film1 = new Film();
        Film film2 = new Film();
        System.out.println(film1);
        System.out.println(film2);

    }
    @Test
    public void testMyBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        Course course = context.getBean("mybean", Course.class);
        System.out.println(course);
    }
    //bean的生命周期演示
    @Test
    public void testBeanLife(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println("获取到了创建的bean实例对象");
        System.out.println(order);

        //手动销毁
        context.close();
    }
    //自动装配
    @Test
    public void testBean8(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
        Emps emps = context.getBean("emps", Emps.class);
        System.out.println(emps);

    }
    @Test
    public void testAnnotation(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        OrderService orderService = context.getBean("orderService", OrderService.class);
        System.out.println(orderService);
        orderService.add();

    }
    @Test
    public void testConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        OrderService orderService = context.getBean("orderService", OrderService.class);
        System.out.println(orderService);
        orderService.add();
    }
    @Test
    public void testAopAnno(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopanno.xml");
        People people = context.getBean("people", People.class);
        people.add();
    }
    @Test
    public void testAopXml(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopxml.xml");
        Runner runner = context.getBean("runner", Runner.class);
        runner.run();
    }

}
