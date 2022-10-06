package com.atgx.memento.game;

/**
 * @author liugx
 * @Description 守护着对象
 * @date 2022/10/6 18:24
 **/
public class Caretaker {
    //只保存一次状态
    private Memento memento;
    //对GameRole 保存多次状态
    //private ArrayList<Memento> mementos;
    //对多个游戏角色保存多个状态
    //private HashMap<String, ArrayList<Memento>> rolesMementos;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
