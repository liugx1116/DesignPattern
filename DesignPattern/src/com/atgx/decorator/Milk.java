package com.atgx.decorator;

/**
 * 被装饰者子类
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }
}
