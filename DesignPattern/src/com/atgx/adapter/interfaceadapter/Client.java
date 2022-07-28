package com.atgx.adapter.interfaceadapter;


/**
 * @author lgx
 * @description:接口适配器
 * @date 2022/7/279:19
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter(){
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        adapter.m1();
    }
}
