package com.atgx.decorator;

/**
 * 被装饰者缓冲类
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
