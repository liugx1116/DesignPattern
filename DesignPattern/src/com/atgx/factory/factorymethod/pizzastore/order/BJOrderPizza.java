package com.atgx.factory.factorymethod.pizzastore.order;

import com.atgx.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.atgx.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.atgx.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/6/3012:20
 */
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
