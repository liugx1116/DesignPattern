package com.atgx.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理-工厂类
 */
public class ProxyFactory {
    // 目标对象
    private Object targtObj;
    //构造器 ， 对target 进行初始化
    public ProxyFactory(Object targtObj) {
        this.targtObj = targtObj;
    }

    //给目标对象 生成一个代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(), ProxyFactory.class.getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始JDK代理");
                        //反射机制调用目标对象的方法
                        Object returnValue = method.invoke(targtObj, args);
                        System.out.println("结束JDK代理");
                        return returnValue;
                    }
                });
    }

}
