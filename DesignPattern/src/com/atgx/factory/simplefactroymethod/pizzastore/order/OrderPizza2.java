package com.atgx.factory.simplefactroymethod.pizzastore.order;

import com.atgx.factory.simplefactroymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/6/309:10
 */
public class OrderPizza2 {
    // 构造器
    public OrderPizza2(){
        Pizza pizza = null;
        String orderType; //披萨类型
        do{
            orderType = getType();
            pizza = SimpleFactory.createPizza(orderType);
            if(pizza != null){
                //输出pizza 制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购披萨失败");
                break;
            }

        }while (true);

    }

    private String getType(){
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
