package com.atgx.proxy.dynamic;

public class Client {
    public static void main(String[] args) throws Exception {
        // 目标对象
        ITeacherDao target = new TeachDao();
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
    }
}
