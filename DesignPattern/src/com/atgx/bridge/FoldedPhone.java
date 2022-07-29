package com.atgx.bridge;

/**
 * @author lgx
 * @description: 是 (Phone)Abstraction 抽象类的子类 /折叠式手机类
 * @date 2022/7/298:32
 */
public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open(){
        super.open();
        System.out.println("折叠样式手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠样式手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
