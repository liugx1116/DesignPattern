package com.atgx.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite 非叶子节点， 用于存储子部件， 在 Component 接口中实现 子部件的相关操作，比如增加(add), 删除。
 */
public class University extends OrganizationComponent{

    List<OrganizationComponent> organizationComponentLists = new ArrayList<>();
    public University(String name, String desc) {
        super(name, desc);
    }

    /**
     * print方法，就是输出University 包含的学院
     */
    @Override
    protected void print() {
        System.out.println("==============="+getName()+"================");
        for (OrganizationComponent organizationComponentList : organizationComponentLists) {
            organizationComponentList.print();
        }
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
//        super.add(organizationComponent);
        organizationComponentLists.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
//        super.remove(organizationComponent);
        organizationComponentLists.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }
}
