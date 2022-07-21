package com.atgx.factory.absfactory.pizzastore.pizza;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/111:58
 */
public  class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }
}
