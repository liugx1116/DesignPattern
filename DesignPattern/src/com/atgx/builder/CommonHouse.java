package com.atgx.builder;

/**
 * @author lgx
 * @description: 建造普通房子
 * @date 2022/7/219:25
 */
public class CommonHouse extends AbstractHouse{
    @Override
    void buildBasic() {
        System.out.println(" 普通房子打地基 ");
    }

    @Override
    void buildWalls() {
        System.out.println(" 普通房子砌墙 ");
    }

    @Override
    void roofed() {
        System.out.println(" 普通房子封顶 ");
    }
}
