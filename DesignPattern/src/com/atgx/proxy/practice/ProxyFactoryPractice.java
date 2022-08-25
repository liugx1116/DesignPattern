package com.atgx.proxy.practice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: liugx
 * @CreateTime: 2022-08-24  09:12
 * @Description: 动态代理-动态代理工厂
 * @Version: 1.0
 */
public class ProxyFactoryPractice {
    // targtObj 被代理类对象
    Object targtObj;
    public ProxyFactoryPractice(Object targtObj) {
        this.targtObj = targtObj;
    }

    /**
     *
     * @return
     */
    public Object getInstance(){
        return Proxy.newProxyInstance(targtObj.getClass().getClassLoader(), targtObj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = method.invoke(targtObj, args);
                return result;
            }
        });
    }
}
