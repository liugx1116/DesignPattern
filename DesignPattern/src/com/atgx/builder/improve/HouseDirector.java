package com.atgx.builder.improve;

/**
 * @author lgx
 * @description: 建造者模式： 指挥者，这里去指定制作流程，返回产品
 * @date 2022/7/229:02
 */
public class HouseDirector {

    HouseBuilder houseBuilder =null;

    //构造器传入 houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //通过setter 传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasi();
        houseBuilder.builWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
