package com.atgx.visitor;

public class Man extends Person{
    @Override
    void accept(Action action) {
        action.getManResult(this);
    }
}
