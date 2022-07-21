package com.atgx.factory.absfactory.pizzastore.order;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/49:06
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }
}
