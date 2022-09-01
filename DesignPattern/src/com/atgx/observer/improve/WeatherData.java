package com.atgx.observer.improve;

import java.util.ArrayList;

/**
 * @Author: liugx
 * @CreateTime: 2022-09-01  09:11
 * @Description: 观察者模式-主题的具体实现类
 * 1. 包含最新的天气情况信息
 * 2. 含有 观察者集合，使用ArrayList管理
 * 3. 当数据有更新时，就主动的调用   ArrayList, 通知所有的（接入方）就看到最新的信息
 * @Version: 1.0
 */
public class WeatherData implements Subject{
    private float temperatrue;
    private float pressure;
    private float humidity;

    /**
     * 观察者集合
     */
    private ArrayList<Observer> observers;


    /**
     * 加入新的第三方
     * @param 
     */
    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    /**
     * 数据发生变化，调用接入方的update
     */
    public  void dataChannge(){
        notifyObservers();
    }

    /**
     * 数据更新时使用 setDate
     * @param temperatrue
     * @param pressure
     * @param humidity
     */
    public void setDate(float temperatrue ,float pressure ,float humidity){
        this.temperatrue = temperatrue;
        this.pressure = temperatrue;
        this.humidity = humidity;
        // 调用 dataChannge将最新的信息推送给接入方
        dataChannge();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.temperatrue,this.pressure,this.humidity);
        }
    }

    public float getTemperatrue() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }
}
