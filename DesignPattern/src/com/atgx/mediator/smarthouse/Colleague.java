package com.atgx.mediator.smarthouse;


/**
 * @author liugx
 * @Description 中介者模式-抽象同事类
 * @date 2022/9/6 07:06
 **/
public abstract class Colleague {
    private Mediator mediator;
    public String name = "";

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }
    public abstract void sendMessage(int stateChange);
}
