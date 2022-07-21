package com.atgx.factory.factorymethod.pizzastore.order;

import com.atgx.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.atgx.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.atgx.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/6/3012:26
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
