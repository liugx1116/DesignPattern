package com.atgx.memento.theory;

/**
 * @author liugx
 * @Description TODO
 * @date 2022/10/3 21:37
 **/
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState(" 状态#1 攻击力 100 ");
        // 保存当前状态
        caretaker.add(originator.saveStateMemento());

        originator.setState(" 状态#1 攻击力 70 ");
        caretaker.add(originator.saveStateMemento());

        originator.setState(" 状态#1 攻击力 140 ");
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前的状态是="+originator.getState());

        originator.getstateFromMemento(caretaker.get(0));
        System.out.println("恢复到状态1，当前的状态是");
        System.out.println("当前的状态是="+originator.getState());
    }
}
