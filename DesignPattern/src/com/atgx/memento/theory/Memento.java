package com.atgx.memento.theory;

/**
 * @author liugx
 * @Description 备忘录对象,负责保存好记录，即 Originator 内部状态
 * @date 2022/10/3 21:24
 **/
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
