package com.atgx.command;

/**
 *命令模式-命令接口
 */
public interface Command {
    // 执行 动作
    void excute();
    // 撤销动作
    void undo();
}
