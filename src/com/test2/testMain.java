package com.test2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 测试bean标签的scope属性的singleton单例模式
 * 说明:Singleton: Spring容器只存在一个共享的bean实例
 */
public class testMain {
    public static void main(String[] args) {
        //创建Spring上下文（加载bean.xml）
        ApplicationContext acx= new ClassPathXmlApplicationContext("bean2.xml");
        //获取HelloWorld实例并赋值
        user id=acx.getBean("user",user.class);
        id.setUsername("毛梓仰testMain2");
        id.setEmail("1144035882@qq.comtestMain2");
//再获取一个HelloWorld实例，不赋值
        user idNew=acx.getBean("user",user.class);
        //调用方法
        id.ShwoUser();
        idNew.ShwoUser();
    }
}