package com.atgx.principle.inversion.improve;

/**
 * @author kingdee
 * @description: 依赖倒转原则
 * @date 2022/6/168:47
 */
public class DependecyInversionImprove {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}

interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{

    @Override
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

class WeChat implements IReceiver{

    @Override
    public String getInfo() {
        return "微信信息: hello,ok";
    }
}
class Person{ //方式2
    //这里我们是对接口的依赖
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}

