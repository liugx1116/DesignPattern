package com.atgx.principle.singleresponsibility;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/6/149:06
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicke roadVehicke = new RoadVehicke();
        roadVehicke.run("摩托车");
        AirVehicke airVehicke = new AirVehicke();
        airVehicke.run("飞机");
        WaterVehicke waterVehicke = new WaterVehicke();
        waterVehicke.run("船");
    }

}

class RoadVehicke{

    public void run(String vehicle){
        System.out.println(vehicle + "公路运行");
    }
}

class AirVehicke{

    public void run(String vehicle){
        System.out.println(vehicle + "天空运行");
    }
}

class WaterVehicke{

    public void run(String vehicle){
        System.out.println(vehicle + "水中运行");
    }
}
