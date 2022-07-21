package com.atgx.factory.absfactory.pizzastore.order;

import com.atgx.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/49:07
 */
public class OrderPizza {

    AbsFactory factory;
    // 构造器
    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }


    private void  setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType; //披萨类型
        this.factory = factory;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
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
