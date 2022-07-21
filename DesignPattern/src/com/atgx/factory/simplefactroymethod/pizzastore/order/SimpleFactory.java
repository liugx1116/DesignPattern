package com.atgx.factory.simplefactroymethod.pizzastore.order;

import com.atgx.factory.simplefactroymethod.pizzastore.pizza.CheesePizza;
import com.atgx.factory.simplefactroymethod.pizzastore.pizza.GreekPizza;
import com.atgx.factory.simplefactroymethod.pizzastore.pizza.PepperPizza;
import com.atgx.factory.simplefactroymethod.pizzastore.pizza.Pizza;

/**
 * @author lgx
 * @description: 简单工厂模式(静态工厂模式 )
 * @date 2022/6/309:02
 */
public class SimpleFactory {

    public static Pizza createPizza(String orderType){
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        if(orderType.endsWith("greek")){
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        }else if(orderType.endsWith("cheese")){
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        }else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
