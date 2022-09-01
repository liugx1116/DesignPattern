package com.atgx.observer;

/**
 * @Author: liugx
 * @CreateTime: 2022-08-31  09:02
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建接入方 currentConditions
        CurrentConditions currentConditions = new CurrentConditions();
        //创建 WeatherData 并将 接入方 currentConditions 传递到 WeatherData中
        WeatherData weatherData = new WeatherData(currentConditions);
        // 设置天气情况
        weatherData.setDate(30,100,20);
        System.out.println("=======天气情况发生变==========");
        weatherData.setDate(34,80,25);
    }
}
