package com.atgx.principle.segregation;

/**
 * @author lgx
 * @description: 接口隔离
 * @date 2022/6/158:42
 */
public class Segregation1 {
    public static void main(String[] args) {
        Interface1 interfaceB = new B();
        Interface1 interfaceD = new D();
        A a = new A();
        a.depend1(interfaceB);
        a.depend2(interfaceB);
        a.depend3(interfaceB);
        C c = new C();
        c.depend1(interfaceD);
        c.depend2(interfaceD);
        c.depend3(interfaceD);
    }
}

interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
}

class B implements Interface1{

    @Override
    public void operation1() {
        System.out.println("B实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B实现了operation4");

    }
}

class D implements Interface1{

    @Override
    public void operation1() {
        System.out.println("D实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D实现了operation4");
    }
}

class A{ //A 类通过接口Interface1 依赖(使用) B类，但是只会用到1,2,3方法

    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
}


class C{ //C 类通过接口Interface1 依赖(使用) D类，但是只会用到1,3,4方法

    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation3();
    }
    public void depend3(Interface1 i){
        i.operation4();
    }
}