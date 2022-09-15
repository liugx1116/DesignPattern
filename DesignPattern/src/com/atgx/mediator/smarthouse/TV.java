package com.atgx.mediator.smarthouse;

/**
 * @Author: liugx
 * @CreateTime: 2022-09-13  10:57
 * @Description: TODO
 * @Version: 1.0
 */
public class TV extends Colleague{
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void startTV() {
        System.out.println("打开tv");
    }

    public void closeTV() {
        System.out.println("关闭tv");
    }
}
