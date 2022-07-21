package com.atgx.singleton.type6;

/**
 * @author lgx
 * @description: 懒汉式(线程安全，同步代码块)
 * @date 2022/6/2810:08
 */
public class SingletonTest06 {
}

class Singleton{
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(null ==instance){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
