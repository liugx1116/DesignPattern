package com.atgx.singleton.type3;

/**
 * @author lgx
 * @description: 懒汉式(线程不安全)
 * @date 2022/6/289:57
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("懒汉式1 ， 线程不安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton{

    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance(){
        if(null == instance){
            instance = new Singleton();
        }
        return instance;
    }
}