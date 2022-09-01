package com.atgx.observer;

/**
 * @Author: liugx
 * @CreateTime: 2022-08-31  08:56
 * @Description: 天气相关情况
 * @Version: 1.0
 */
public class WeatherData {
    private float temperatrue;
    private float pressure;
    private float humidity;
    //加入新的第三方
    private CurrentConditions currentConditions;

    public void dataChange(){
        //调用 接入方的 update
        currentConditions.update(getTemperatrue(),getPressure(),getHumidity());
    }

    /**
     * 更新数据
     */
    public void setDate(float temperatrue ,float pressure , float humidity){
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 接入方 currentConditions
        dataChange();
    }

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
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

    public CurrentConditions getCurrentConditions() {
        return currentConditions;
    }
}
