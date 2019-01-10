package com.test4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *功能:用于测试init-method和destroy-method,初始化对象和销毁对象
 * 说明:注意，当我们将bean的scope属性设置为singleton或者默认时，当容器销毁时才会调用destroy-method的方法
 */
public class testMain {
    public static void main(String[] args) {
        //创建Spring上下文（加载bean.xml）
        ApplicationContext acx= new ClassPathXmlApplicationContext("bean4.xml");
        //获取HelloWorld实例并赋值
        user id=acx.getBean("user",user.class);
        id.setUsername("毛梓仰testMain2");
        id.setEmail("1144035882@qq.comtestMain2");
        //调用方法
        id.ShwoUser();
        //销毁实例对象
        ((ClassPathXmlApplicationContext) acx).close();

    }
}