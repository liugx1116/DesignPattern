package com.atgx.factory.factorymethod.pizzastore.order;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/6/3012:26
 */
public class PizzaStore {
    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            new BJOrderPizza();
        } else {
            //创建伦敦口味的各种Pizza
            new LDOrderPizza();
        }
    }
}
