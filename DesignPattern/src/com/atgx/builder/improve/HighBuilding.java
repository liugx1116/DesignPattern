package com.atgx.builder.improve;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/228:59
 */
public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasi() {
        System.out.println("高楼打地基100m");
    }

    @Override
    public void builWalls() {
        System.out.println("高楼砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼透明屋顶");
    }
}
