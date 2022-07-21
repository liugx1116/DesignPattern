package com.atgx.factory.absfactory.pizzastore.order;

import com.atgx.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @author lgx
 * @description: 抽象工厂-披萨的公共接口
 * @date 2022/7/19:20
 */
//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
