package com.atgx.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liugx
 * @Description 守护者对象,负责保存多个备忘录对象
 * @date 2022/10/3 21:23
 **/
public class Caretaker {
    //在List 集合中会有很多的备忘录对象
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento){
        mementoList.add(memento);
    }
    //获取到第index个Originator 的 备忘录对象(即保存状态)
    public Memento get(int index){
        return mementoList.get(index);
    }
}
