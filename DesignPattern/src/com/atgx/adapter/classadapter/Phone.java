package com.atgx.adapter.classadapter;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/269:01
 */
public class Phone {

    // 充电
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压为5V, 可以充电~~");
        }else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V, 不能充电~~");
        }
    }
}
