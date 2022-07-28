package com.atgx.adapter.classadapter;

/**
 * @author lgx
 * @description: 被适配的类
 * @date 2022/7/268:51
 */
public class Voltage220V {
    // 输出220v电压
    public int output220V(){
        int src = 220;
        System.out.println("电压1=" + src + "伏");
        return src;
    }
}
