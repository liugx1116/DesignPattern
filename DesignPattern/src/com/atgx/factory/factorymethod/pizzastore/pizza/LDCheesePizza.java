package com.atgx.factory.factorymethod.pizzastore.pizza;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/6/3012:27
 */
public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}
