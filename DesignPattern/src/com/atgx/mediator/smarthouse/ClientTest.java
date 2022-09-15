package com.atgx.mediator.smarthouse;

/**
 * @Author: liugx
 * @CreateTime: 2022-09-14  08:57
 * @Description: TODO
 * @Version: 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        //创建一个中介者对象
        ConcreteMediator concreteMediator = new ConcreteMediator();
        //创建Alarm 并且加入到  ConcreteMediator 对象的HashMap
        Alarm alarm = new Alarm(concreteMediator, "alarm");

        CoffeeMachine coffeeMachine = new CoffeeMachine(concreteMediator, "coffeeMachine");
        //创建 Curtains , 并  且加入到  ConcreteMediator 对象的HashMap
        Curtains curtains = new Curtains(concreteMediator, "curtains");
        TV tv = new TV(concreteMediator, "tV");
        //让闹钟发出消息
        alarm.sendMessage(0);
        coffeeMachine.endCoffe();
        alarm.sendMessage(1);

    }
}
