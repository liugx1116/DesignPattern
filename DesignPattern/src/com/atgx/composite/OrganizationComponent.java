package com.atgx.composite;

import lombok.Data;

/**
 * 设计模式->组合模式
 */
@Data
public abstract class OrganizationComponent {
    private String name;
    private String desc;
    // 构造器
    public OrganizationComponent(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    protected void add(OrganizationComponent organizationComponent){
        // 默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    // 打印 做成抽象的, 子类都需要实现
    protected abstract void print();
}
