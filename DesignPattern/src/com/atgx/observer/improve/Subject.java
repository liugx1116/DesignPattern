package com.atgx.observer.improve;

/**
 * @Author: liugx
 * @CreateTime: 2022-09-01  09:05
 * @Description: 设计模式-观察者模式：主题
 * 该接口规定了具体主题需要实现的方法，比如，添加、删除观察者以及通知观察者更新数据的方法。
 * @Version: 1.0
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    /**
     * 遍历所有观察者，并通知
     */
    public void notifyObservers();
}
