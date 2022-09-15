package com.atgx.mediator.smarthouse;

import java.util.HashMap;

/**
 * @author liugx
 * @Description 具体中介者对象
 * 实现抽象类的方法,需要知道所有的具体同事类，并且从具体同事类接受消息，向具体同事类发出命令
 * @date 2022/9/7 09:42
 **/
public class ConcreteMediator extends Mediator {
    // 放入所有的同事对象
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    @Override
    public void Register(String colleagName, Colleague colleague) {
        colleagueMap.put(colleagName, colleague);

        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagName);
        }
    }

    /**
     * 具体中介者的核心方法
     * 1. 根据得到消息，完成对应任务
     * 2. 中介者在这个方法，协调各个具体的同事对象，完成任务
     *
     * @param stateChange
     * @param colleagueName
     */
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        Colleague colleague = colleagueMap.get(colleagueName);
        // 闹钟响起
        if (colleague instanceof Alarm) {
            if (stateChange == 0) {
                String coffeeMachine = interMap.get("CoffeeMachine");
                CoffeeMachine coffeeMachineObj = (CoffeeMachine) colleagueMap.get(coffeeMachine);
                coffeeMachineObj.startCoffe();
                TV tv = (TV) colleagueMap.get(interMap.get("TV"));
                tv.startTV();
            } else if (stateChange == 1) {
                TV tv = (TV) colleagueMap.get(interMap.get("TV"));
                tv.closeTV();
            }

        } else if (colleague instanceof CoffeeMachine) {
            Curtains curtains = (Curtains) colleagueMap.get(interMap.get("Curtains"));
            curtains.UpCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof TV) {
            //如果TV发现消息

        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            //如果是以窗帘发出的消息，这里处理...
        }

    }

    @Override
    public void sedMessage() {

    }
}
