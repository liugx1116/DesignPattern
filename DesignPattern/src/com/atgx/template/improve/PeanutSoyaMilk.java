package com.atgx.template.improve;

/**
 * 模版方法方法模式-模板
 */
public class PeanutSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入花生");
    }
}
