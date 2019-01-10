package com.test1;

/**
 * 描述:创建USER持久化类
 * 作用:以满足JavaBean规范需求
 * @Author: mzy
 * @Date: 2019-1-10 14:23
 */
public class user {
    //    private int id;//编号id属性
    private String username;//编号username属性
    //    private String password;
    private String email;

    /**
     * 描述:user类的构造函数
     * 作用:初始化对象
     * 是否必须:yes
     **/
    public user(){}

    /**
     * 自我介绍
     */
    public void ShwoUser(){
        System.out.println("您好，我叫"+this.username+",邮箱是"+this.email+"！");
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public void setEmail(String email) {
        this.email = email;
    }

}