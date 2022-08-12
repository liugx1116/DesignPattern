package com.atgx.facade;

/**
 * 灯光
 */
public class TheaterLight {
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" TheaterLight on");
    }

    public void off(){
        System.out.println(" TheaterLight off");
    }
    // 变亮
    public void dim(){
        System.out.println(" TheaterLight dim");
    }
    // 变暗
    public void bright(){
        System.out.println(" TheaterLight bright");
    }
}
