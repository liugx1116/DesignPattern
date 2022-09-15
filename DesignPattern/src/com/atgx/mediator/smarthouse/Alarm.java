package com.atgx.mediator.smarthouse;

/**
 * @author liugx
 * @Description 具体同事类 - 闹钟
 * @date 2022/9/7 08:33
 **/
public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在创建Alarm 同事对象时，将自己放入到ConcreteMediator 对象中[集合]
        mediator.Register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用的中介者对象的getMessage
        this.getMediator().getMessage(stateChange , this.name);
    }

}
