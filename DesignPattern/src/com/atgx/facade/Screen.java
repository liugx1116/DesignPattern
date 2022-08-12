package com.atgx.facade;

/**
 * 屏幕
 */
public class Screen {
    private static Screen instance = new Screen();
    public static Screen getInstance(){
        return instance;
    }

    public void down(){
        System.out.println(" screen down");
    }

    public void up(){
        System.out.println(" screen up");
    }
}
