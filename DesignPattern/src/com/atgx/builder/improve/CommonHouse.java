package com.atgx.builder.improve;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/229:01
 */
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasi() {
        System.out.println(" 普通房子打地基5米 ");
    }

    @Override
    public void builWalls() {
        System.out.println(" 普通房子砌墙10cm ");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子屋顶 ");
    }
}
