package com.atgx.bridge;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/298:35
 */
public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直立手机样式");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直立手机样式");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立手机样式");
    }
}

