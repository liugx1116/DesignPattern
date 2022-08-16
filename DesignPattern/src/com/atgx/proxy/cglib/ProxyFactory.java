package com.atgx.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *  cglib代理-工厂类
 */
public class ProxyFactory implements MethodInterceptor {

    private Object targObj;

    public ProxyFactory(Object obj) {
        this.targObj = obj;
    }

    //返回一个代理对象:  是 target 对象的代理对象
    public Object getProxyInstance(){
        // 1.cglib工具类
        Enhancer enhancer = new Enhancer();
        // 2.设置父类
        enhancer.setSuperclass(targObj.getClass());
        // 3.设置回调函数
        enhancer.setCallback(this);
        return enhancer.create();
    }

    // //拦截方法
    @Override
    public Object intercept(Object arg0, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始代理");
        Object res = method.invoke(targObj, objects);
        System.out.println("结束代理");
        return null;
    }
}
