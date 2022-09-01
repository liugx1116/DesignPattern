package com.atgx.observer.improve;


/**
 * @Author: liugx
 * @CreateTime: 2022-09-01  10:56
 * @Description: TODO
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 具体主题
        WeatherData weatherData = new WeatherData();

        // 创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        Google google = new Google();
        // 注册
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(google);
        System.out.println("==================开始通知1==============");
        weatherData.setDate(10,20,30);
        weatherData.removeObserver(currentConditions);
        System.out.println("==================开始通知2==============");
        weatherData.setDate(14,90,30);

    }
}
