package com.atgx.command;

public class Client {

    public static void main(String[] args) {

        LightReceiver lightReceiver = new LightReceiver();
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,new LightOnCommand(lightReceiver),new LightOffCommand(lightReceiver));

        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonWasPushed();
    }
}
