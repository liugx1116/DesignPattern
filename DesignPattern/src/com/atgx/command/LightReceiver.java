package com.atgx.command;

/**
 * 命令模式-命令执行者（接受）
 */
public class LightReceiver {

    public void on(){
        System.out.println("打开灯---");
    }

    public void off(){
        System.out.println("关闭灯---");
    }
}
