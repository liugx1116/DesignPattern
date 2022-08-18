package com.atgx.visitor;

/**
 * 访问者模式-访问者
 */
public abstract class Action {
    abstract void getManResult(Man man);
    abstract void getWomenResult(Women man);
}
