package com.atgx.visitor;

public abstract class Person {
    //提供一个方法，让访问者可以访问
    abstract void accept(Action action);
}
