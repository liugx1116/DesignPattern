package com.atgx.state;

/**
 * @Author: liugx
 * @CreateTime: 2022-10-12  17:10
 * @Description: 状态抽象类
 * @Version: 1.0
 */
public  abstract class State {
    // 扣除积分 - 50
    public abstract void deductMoney();

    // 是否抽中奖品
    public abstract boolean raffle();

    // 发放奖品
    public abstract  void dispensePrize();
}
