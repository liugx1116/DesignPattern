package com.atgx.mediator.smarthouse;

/**
 * @author liugx
 * @Description 具体同事类-咖啡机
 * @date 2022/9/7 09:39
 **/
public class CoffeeMachine extends Colleague{

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,name);
    }

    public void startCoffe(){
        System.out.println("开始制作咖啡");
    }

    public void endCoffe(){
        System.out.println("结束制作咖啡");
    }
}
