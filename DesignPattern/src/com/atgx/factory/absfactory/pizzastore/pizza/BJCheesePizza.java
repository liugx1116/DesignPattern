package com.atgx.factory.absfactory.pizzastore.pizza;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/111:56
 */
public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }
}
