package com.atgx.factory.absfactory.pizzastore.pizza;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/49:03
 */
public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}
