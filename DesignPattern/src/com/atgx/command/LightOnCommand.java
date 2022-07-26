package com.atgx.command;

public class LightOnCommand implements Command{

    // 聚合LightReceiver
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void excute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
//        调用接收者的方法
        lightReceiver.off();
    }
}
