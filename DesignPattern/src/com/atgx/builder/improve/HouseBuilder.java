package com.atgx.builder.improve;

/**
 * @author lgx
 * @description: 抽象的建造者
 * @date 2022/7/228:53
 */
public abstract class HouseBuilder {

    protected House house = new House();

    //将建造的流程写好, 抽象的方法
    public abstract void buildBasi();

    public abstract void builWalls();

    public abstract void roofed();
    //建造房子好， 将产品(房子) 返回
    public House buildHouse(){
        return house;
    }
}
