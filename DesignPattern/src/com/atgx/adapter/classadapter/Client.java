package com.atgx.adapter.classadapter;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/268:50
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("===========类适配器模式============");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
