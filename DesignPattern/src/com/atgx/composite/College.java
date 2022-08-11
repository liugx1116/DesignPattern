package com.atgx.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院
 */
public class College extends OrganizationComponent{

    List<OrganizationComponent> organizationComponentLists = new ArrayList<>();
    public College(String name, String desc) {
        super(name, desc);
    }

    /**
     * print方法，就是输出学院包含的专业
     */
    @Override
    protected void print() {
        System.out.println("=============="+getName()+"===============");
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
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
