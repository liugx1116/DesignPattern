package com.atgx.facade;

public class DVDPlayer {
    // 单类模式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public DVDPlayer() {
    }
     public void on(){
         System.out.println("dvd on...");
     }

    public void off(){
        System.out.println("dvd off...");
    }

    public void playing(){
        System.out.println("dvd playing...");
    }

    public void pause(){
        System.out.println("pause playing...");
    }
}
