package com.atgx.mediator.smarthouse;

import java.util.HashMap;

/**
 * @author liugx
 * @Description 具体中介者对象
 * 实现抽象类的方法,需要知道所有的具体同事类，并且从具体同事类接受消息，向具体同事类发出命令
 * @date 2022/9/7 09:42
 **/
public class ConcreteMediator extends Mediator{
    // 放入所有的同事对象
    private HashMap<String,Colleague> colleagueMap;
    private HashMap<String,String> interMap;

    @Override
    public void Register(String colleagName, Colleague colleague) {

    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {

    }

    @Override
    public void sedMessage() {

    }
}
