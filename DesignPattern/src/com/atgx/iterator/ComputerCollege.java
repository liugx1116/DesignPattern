package com.atgx.iterator;

import java.util.Iterator;

/**
 * @Author: liugx
 * @CreateTime: 2022-08-19  09:23
 * @Description: 迭代器模式- 计算机学院
 * @Version: 1.0
 */
public class ComputerCollege implements College{

    Department[] departments;
    int numofDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java专业", " Java专业 ");
        addDepartment("PHP专业", " PHP专业 ");
        addDepartment("大数据专业", " 大数据专业 ");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name , desc);
        departments[numofDepartment] = department;
        numofDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
