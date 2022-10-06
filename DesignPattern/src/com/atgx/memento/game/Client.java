package com.atgx.memento.game;

/**
 * @author liugx
 * @Description TODO
 * @date 2022/10/6 18:26
 **/
public class Client {
    public static void main(String[] args) {
        //  创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("大战前状态");
        gameRole.display();
        //  保存状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMenmento());

        System.out.println( "与boss大战");
        gameRole.setVit(30);
        gameRole.setDef(40);
        gameRole.display();

        System.out.println("大战后，使用备忘录模式恢复大战前状态");
        gameRole.recoverGameRoleFromMenento(caretaker.getMemento());
        System.out.println("恢复后的状态");
        gameRole.display();
    }
}
