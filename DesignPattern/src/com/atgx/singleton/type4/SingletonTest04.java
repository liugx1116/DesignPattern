package com.atgx.singleton.type4;

/**
 * @author lgx
 * @description: 懒汉式(线程安全，同步方法)
 * @date 2022/6/2810:02
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("懒汉式2 ， 线程安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}
// 懒汉式(线程安全，同步方法)
class Singleton{
    private static Singleton instance = null;
    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(null == instance){
            instance = new Singleton();
        }
        return instance;
    }
}