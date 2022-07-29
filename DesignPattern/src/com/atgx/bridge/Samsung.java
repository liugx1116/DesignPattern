package com.atgx.bridge;

/**
 * @author lgx
 * @description: 行为的具体实现类
 * @date 2022/7/298:26
 */
public class Samsung implements Brand{
    @Override
    public void open() {
        System.out.println("三星手机开机");
    }

    @Override
    public void close() {
        System.out.println("三星手机关机");
    }

    @Override
    public void call() {
        System.out.println("三星手机打电话");
    }
}
