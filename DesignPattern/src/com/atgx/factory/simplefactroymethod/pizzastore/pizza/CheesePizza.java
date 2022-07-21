package com.atgx.factory.simplefactroymethod.pizzastore.pizza;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/6/2812:22
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 给制作奶酪披萨 准备原材料 ");
    }
}
