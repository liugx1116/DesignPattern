package com.atgx.factory.factorymethod.pizzastore.pizza;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/6/3012:20
 */
public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }
}
