package com.atgx.builder;

/**
 * @author lgx
 * @description: 初始：盖房子父类
 * @date 2022/7/219:23
 */
public abstract class AbstractHouse {
    // 打地基
    abstract void buildBasic();
    //砌墙
    abstract void buildWalls();
    //封顶
    abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
