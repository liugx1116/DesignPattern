package com.atgx.factory.simplefactroymethod.pizzastore.order;

import com.atgx.factory.simplefactroymethod.pizzastore.pizza.CheesePizza;
import com.atgx.factory.simplefactroymethod.pizzastore.pizza.GreekPizza;
import com.atgx.factory.simplefactroymethod.pizzastore.pizza.PepperPizza;
import com.atgx.factory.simplefactroymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lgx
 * @description:
 * @date 2022/6/2812:25
 */
public class OrderPizza {

    // 构造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType; //披萨类型
        do{
            orderType = getType();
			if (orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName(" 希腊披萨 ");
			} else if (orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName(" 奶酪披萨 ");
			} else if (orderType.equals("pepper")) {
				pizza = new PepperPizza();
				pizza.setName("胡椒披萨");
			} else {
				break;
			}
			//输出pizza 制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
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
