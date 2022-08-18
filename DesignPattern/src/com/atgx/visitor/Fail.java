package com.atgx.visitor;

public class Fail extends Action{
    @Override
    void getManResult(Man man) {
        System.out.println("男人的给的评价很失败");
    }

    @Override
    void getWomenResult(Women man) {
        System.out.println("女人给的评价很失败");
    }
}
