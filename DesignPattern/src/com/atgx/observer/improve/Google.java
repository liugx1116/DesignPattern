package com.atgx.observer.improve;

/**
 * @Author: liugx
 * @CreateTime: 2022-09-01  11:04
 * @Description: TODO
 * @Version: 1.0
 */
public class Google implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;
    @Override
    public void update(float tempreate, float pressure, float h) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("===Google====");
        System.out.println("***Google 气温 : " + temperature + "***");
        System.out.println("***Google 气压: " + pressure + "***");
        System.out.println("***Google 湿度: " + humidity + "***");
    }
}
