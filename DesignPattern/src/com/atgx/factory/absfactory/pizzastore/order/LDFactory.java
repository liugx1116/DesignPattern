package com.atgx.factory.absfactory.pizzastore.order;

import com.atgx.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.atgx.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.atgx.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/49:01
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
