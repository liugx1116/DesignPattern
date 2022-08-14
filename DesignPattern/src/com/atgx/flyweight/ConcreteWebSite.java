package com.atgx.flyweight;

/**
 * 设计模式->享元模式：具体网站
 */
public class ConcreteWebSite extends WebSite{
    //共享的部分，内部状态  //网站发布的形式(类型)
    private String type = "";

    public  ConcreteWebSite(String type){
        this.type = type;
    }
    @Override
    public void use(User user) {
        System.out.println("网站的发布形式是："+type+"使用者："+user.getUserName());
    }
}
