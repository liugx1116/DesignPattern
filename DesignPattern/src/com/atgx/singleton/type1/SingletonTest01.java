package com.atgx.singleton.type1;

/**
 * @author lgx
 * @description: 单例模式-饿汉式（静态常量）
 * @date 2022/6/279:07
 */
public class SingletonTest01 {


    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
    }
}

//饿汉式(静态变量)
class Singleton{
    //1) 构造器私有化 (防止 new )
    private Singleton(){
    }
    //        2) 类的内部创建对象
    private final static Singleton instanc= new Singleton();
    //3) 向外暴露一个静态的公共方法。getInstance
    public static Singleton getInstance(){
        return instanc;
    }
}


