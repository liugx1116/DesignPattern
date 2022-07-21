package com.atgx.factory.factorymethod.pizzastore.order;


import com.atgx.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lgx
 * @description: 工厂方法模式
 * @date 2022/6/3012:17
 */
public abstract class OrderPizza {
    //定义一个抽象方法，createPizza , 让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    // 构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; //披萨类型
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            if (pizza != null) {
                //输出pizza 制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }

        } while (true);

    }

    //获取客户希望订购的披萨种类
    private String getType() {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza 种类:");
        String str = null;
        try {
            str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
