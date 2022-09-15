package com.atgx.mediator.smarthouse;

import java.util.HashMap;

/**
 * @Author: liugx
 * @CreateTime: 2022-09-13  11:01
 * @Description: TODO
 * @Version: 1.0
 */
public class Curtains extends Colleague{
    //集合，放入所有的同事对象
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
    public void UpCurtains() {
        System.out.println("I am holding Up Curtains!");
    }
}
