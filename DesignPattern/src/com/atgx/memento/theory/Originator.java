package com.atgx.memento.theory;

/**
 * @author liugx
 * @Description 需要保存状态的对象
 * @date 2022/10/3 21:31
 **/
public class Originator {
    // 状态信息
    private String state;

    //编写一个方法，可以保存一个状态对象 Memento
    //因此编写一个方法，返回 Memento
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    //通过备忘录对象，恢复状态
    public void getstateFromMemento(Memento memento){
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
