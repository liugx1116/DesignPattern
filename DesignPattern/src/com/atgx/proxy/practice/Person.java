package com.atgx.proxy.practice;

/**
 * @Author: liugx
 * @CreateTime: 2022-08-24  09:10
 * @Description: 动态代理-被代理类
 * @Version: 1.0
 */
public class Person implements Human{
    @Override
    public void eat() {
        System.out.println("person 吃");
    }

    @Override
    public String sleep() {
        System.out.println("person 睡觉");
        return "person 睡觉返回";
    }

    @Override
    public String talk(String name) {
        System.out.println("person 说话"+name);
        return "person 说话返回："+name;
    }
}
