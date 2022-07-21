package com.atgx.factory.factorymethod.pizzastore.pizza;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/6/3012:27
 */
public class LDPepperPizza extends Pizza{

    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料");
    }
}
