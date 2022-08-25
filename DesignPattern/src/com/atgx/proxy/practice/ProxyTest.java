package com.atgx.proxy.practice;

/**
 * @Author: liugx
 * @CreateTime: 2022-08-24  09:24
 * @Description: 测试
 * @Version: 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        Human person = new Person();
        ProxyFactoryPractice proxy = new ProxyFactoryPractice(person);
        Human instance = (Human)proxy.getInstance();
        instance.eat();
        String sleep = instance.sleep();
        System.out.println(sleep);
        String zhangsan = instance.talk("zhangsan");
        System.out.println(zhangsan);

    }
}
