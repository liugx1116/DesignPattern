package com.atgx.iterator;

import java.util.Iterator;

/**
 * 设计模式-迭代器模式-具体的迭代器管理类
 */
public class ComputerCollegeIterator implements Iterator {

    //这里我们需要Department 是以怎样的方式存放=>数组
    Department[] departments;
    // 遍历位置
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否还有下一个元素
    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }
    //删除的方法，默认空实现
    @Override
    public void remove() {

    }
}
