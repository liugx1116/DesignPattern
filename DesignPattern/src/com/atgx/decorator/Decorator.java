package com.atgx.decorator;

public class Decorator extends Drink{
    public Drink drink;
    public Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public float cost() {
        // super.getPrice() 自己的价格  + drink.cost() 被装饰者的价格
        return super.getPrice() + drink.cost();
    }
    @Override
    public String getDes() {
        // 输出装饰着的信息
        return super.getDes() + "||" + super.getPrice() + "##" + drink.getDes() +"||"+drink.cost();
    }
}
