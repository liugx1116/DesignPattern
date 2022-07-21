package com.atgx.uml.aggregation;

/**
 * @author lgx
 * @description: uml类图-聚合关系
 * @date 2022/6/248:55
 */
public class Computer { //鼠标可以和computer分离
    private Moniter moniter;
    private Mouse mouse; //显示器可以和Computer分离

    public void setMoniter(Moniter moniter) {
        this.moniter = moniter;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
