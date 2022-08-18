package com.atgx.command;

/**
 * 命令模式-调用者角色
 */
public class RemoteController {
    // 开 按钮的命令数组
    Command[] onCommands;
    Command[] offCommands;
    // 撤销命令
    Command undoCommand;

    // 构造器，完成对按钮初始化
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    // 给我们的按钮设置你需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    // 按下开按钮
    public void onButtonWasPushed(int no){
        onCommands[no].excute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }

    // 按下关闭按钮
    public void offButtonWasPushed(int no){
        offCommands[no].excute();
        // 记录这次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    // 按下撤销按钮
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
