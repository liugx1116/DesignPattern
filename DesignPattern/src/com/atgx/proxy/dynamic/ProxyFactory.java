package com.atgx.proxy.dynamic;

import java.lang.reflect.Constructor;
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
    public Object getProxyInstance() throws Exception {
//        Class<?> proxyClass = Proxy.getProxyClass(targtObj.getClass().getClassLoader(), targtObj.getClass().getInterfaces());
//        System.out.println(proxyClass);
//        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
//        System.out.println(constructor);
//        Class<?> renterProxyClass = Proxy.getProxyClass(Person.class.getClassLoader(), new Class<?>[]{Person.class});
        //1. ClassLoader loader ： 指定当前目标对象使用的类加载器, 获取加载器的方法固定
        //2. Class<?>[] interfaces: 目标对象实现的接口类型，使用泛型方法确认类型
        //3. InvocationHandler h : 事情处理，执行目标对象的方法时，会触发事情处理器方法, 会把当前执行的目标对象方法作为参数传入
        return Proxy.newProxyInstance(targtObj.getClass().getClassLoader(), targtObj.getClass().getInterfaces(),
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
