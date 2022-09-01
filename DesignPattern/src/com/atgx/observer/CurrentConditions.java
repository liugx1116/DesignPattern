package com.atgx.observer;

/**
 * @Author: liugx
 * @CreateTime: 2022-08-31  08:53
 * @Description: 显示当前天气情况 ->气象站自己的网站
 * @Version: 1.0
 */
public class CurrentConditions {
    /*
    温度，气压，湿度
     */
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    /**
     * 显示
     */
    public void display() {
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }
}
