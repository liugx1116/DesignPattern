package com.atgx.principle.singleresponsibility;

/**
 * @author lgx
 * @date 2022/6/149:12
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {

        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("摩托车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("船");
    }
}

class Vehicle2{

    public void run(String vehicle){
        System.out.println(vehicle + " 在公路上运行....");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle + " 在空中上运行....");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle + " 在水中运行....");
    }
}