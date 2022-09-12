package com.atgx.mediator.smarthouse;

/**
  @author liugx
 * @Description 设计模式-中介者模式（抽象中介者）
 * 抽象中介者，定义了同事对象列表中介者对象的接口
 * @date 2022/9/6 06:56
 */
public abstract class Mediator {
    /**
      注册：将中介者对象加入到集合中
      @param colleagName
     * @param colleague
     */
    public abstract void Register(String colleagName,Colleague colleague);

    /**
      接收消息，具体的同事对象发出
      @param stateChange
     * @param colleagueName
     */
    public abstract void getMessage(int stateChange, String colleagueName);

    /**
     * 发送消息
     */
    public abstract void sedMessage();
}
