package com.atgx.bridge;

/**
 * @author lgx
 * @description: 桥接模式-充当桥接类
 * @date 2022/7/298:22
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand){
        this.brand = brand;
    }
    protected void open(){
        brand.open();
    }

    protected void close(){
        brand.close();
    }

    protected void call(){
        brand.call();
    }
}
