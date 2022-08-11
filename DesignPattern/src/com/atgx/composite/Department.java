package com.atgx.composite;

/**
 * 专业-> 叶子节点 没有add remove
 */
public class Department extends OrganizationComponent{

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        System.out.println("h哈哈哈11111");
        return super.getName();
    }

    @Override
    public String getDesc() {
        System.out.println("呵呵呵2222222");
        return super.getDesc();
    }
}
