package com.atgx.decorator;

/**
 * 被装饰者子类-巧克力
 */
public class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDes(" 巧克力 ");
        setPrice(3.0f);
    }
}
