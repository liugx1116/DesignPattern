package com.atgx.singleton.type9;

/**
 * @author lgx
 * @description: 枚举
 * @date 2022/6/2810:24
 */
public class SingletonTest09 {
    public static void main(String[] args) {
        Singleton instance = Singleton.instance;
        Singleton instance2 = Singleton.instance;
        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        instance.sayOk();
    }
}
//使用枚举，可以实现单例, 推荐
enum Singleton{
    instance; // 属性
    public void sayOk(){
        System.out.println("======ok======");
    }
}