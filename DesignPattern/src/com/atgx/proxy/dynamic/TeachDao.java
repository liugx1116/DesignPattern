package com.atgx.proxy.dynamic;

/**
 * 被代理类
 */
public class TeachDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("开始讲课");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("说hello"+name);
    }
}
