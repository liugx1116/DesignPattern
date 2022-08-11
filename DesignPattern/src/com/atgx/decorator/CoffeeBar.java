package com.atgx.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink order1 = new LongBlack();
        System.out.println("单品咖啡-描述"+order1.getDes());
        System.out.println("单品咖啡-价格"+order1.cost());
        order1 = new Milk(order1);
        System.out.println("单品咖啡加入一份牛奶-描述"+order1.getDes());
        System.out.println("单品咖啡加入一份牛奶-价格"+order1.cost());
        order1 = new Chocolate(order1);
        System.out.println("单品咖啡加入一份牛奶一份巧克力-描述"+order1.getDes());
        System.out.println("单品咖啡加入一份牛奶一份巧克力-价格"+order1.cost());
        order1 = new Chocolate(order1);
        System.out.println("单品咖啡加入一份牛奶2份巧克力-描述"+order1.getDes());
        System.out.println("单品咖啡加入一份牛奶2份巧克力-价格"+order1.cost());
    }
}
