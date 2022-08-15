package com.atgx.proxy.staticproxy;

/**
 * 静态代理-被代理类
 */
public class TeachDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课");
    }
}
