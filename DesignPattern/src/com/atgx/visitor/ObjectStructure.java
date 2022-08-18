package com.atgx.visitor;

import java.util.LinkedList;

//数据结构，管理很多人（Man , Woman）
public class ObjectStructure {
    //维护了一个集合
    LinkedList<Person> persons = new LinkedList<>();
    //增加到list
    public void attach(Person person){
        persons.add(person);
    }
    //移除
    public void detach(Person p) {
        persons.remove(p);
    }
    //显示测评情况
    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
