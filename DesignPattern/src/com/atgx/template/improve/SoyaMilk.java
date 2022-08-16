package com.atgx.template.improve;

/**
 * 设计模式-模版方法模式  抽象类
 */
public abstract class SoyaMilk {

    final void make(){
        select();
        if(customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    //钩子方法，决定是否需要添加配料
    public boolean customerWantCondiments() {
        return true;
    }

    //浸泡
    private void beat() {
        System.out.println("黄豆和配料放到豆浆机去打碎");
    }

    private void soak() {
        System.out.println("浸泡");
    }

    private void select() {
        System.out.println("选择材料");
    }

    //添加不同的配料， 抽象方法, 子类具体实现
    abstract void addCondiments();
}
