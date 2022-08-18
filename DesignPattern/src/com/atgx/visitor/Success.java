package com.atgx.visitor;

public class Success extends Action{

    @Override
    void getManResult(Man man) {
        System.out.println("男人给的评价很成功");
    }

    @Override
    void getWomenResult(Women man) {
        System.out.println("女人给的评价很成功");
    }
}
