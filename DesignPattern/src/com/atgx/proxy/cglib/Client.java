package com.atgx.proxy.cglib;

/**
 * cglib代理
 */
public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //获取到代理对象，并且将目标对象传递给代理对象
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao)proxyFactory.getProxyInstance();
        //执行代理对象的方法，触发intecept 方法，从而实现 对目标对象的调用
        String res = proxyInstance.teach();
        System.out.println("结果是："+res);
    }
}
