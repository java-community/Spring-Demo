package com.test1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 功能:最简单的IoC案例,仅调用类方法,实现spring作用
 */
public class testMain {
    public static void main(String[] args) {
        //创建Spring上下文（加载bean.xml）
        ApplicationContext acx= new ClassPathXmlApplicationContext("bean1.xml");
        //获取HelloWorld实例
        user id=acx.getBean("user",user.class);
        //调用方法
        id.ShwoUser();
    }
}