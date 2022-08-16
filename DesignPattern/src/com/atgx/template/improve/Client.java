package com.atgx.template.improve;

public class Client {
    public static void main(String[] args) {
        System.out.println("----制作豆浆----");
        SoyaMilk noAddSoyaMilk = new PureSoyaMilk();
        noAddSoyaMilk.make();
    }

}
