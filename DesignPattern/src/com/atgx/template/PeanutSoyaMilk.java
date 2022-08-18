package com.atgx.template;

/**
 * 模版方法方法模式
 */
public class PeanutSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入花生");
    }
}
