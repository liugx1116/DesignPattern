package com.atgx.adapter.classadapter;

/**
 * @author lgx
 * @description: 适配器类
 * @date 2022/7/268:51
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取到220V电压
        int src = output220V();
        int dest = src/ 44;
        return dest;
    }
}
