package com.atgx.facade;

/**
 * 爆米花
 */
public class Popcorn {

    private static Popcorn instance = new Popcorn();
    public static Popcorn getInstance(){
        return instance;
    }

    public Popcorn() {
    }

    public void on(){
        System.out.println("爆米花 on");
    }

    public void off(){
        System.out.println("爆米花 off");
    }

    public void pop(){
        System.out.println("爆米花 pop");
    }
}
