package com.atgx.singleton.type2;

/**
 * @author lgx
 * @description: 单例模式-饿汉式（静态代码块）
 * @date 2022/6/289:45
 */
public class SingletonTest02 {
}

/**
 * @Description 例模式-饿汉式（静态代码块）
 **/
class Singleton{
   private  Singleton(){ //1. 构造器私有化, 外部不能new
   }

   private static Singleton instance; //2.本类内部创建对象实例

   static{ // 在静态代码块中，创建单例对象
       instance = new Singleton();
   }
   public static Singleton getInstance(){ //3. 提供一个公有的静态方法，返回实例对象
       return instance;
   }
}