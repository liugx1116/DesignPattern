package com.atgx.factory.absfactory.pizzastore.order;

import com.atgx.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.atgx.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.atgx.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/111:55
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        // TODO Auto-generated method stub
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
