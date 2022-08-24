package com.atgx.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: liugx
 * @CreateTime: 2022-08-19  09:09
 * @Description: 迭代器模式-具体迭代的实现类
 * @Version: 1.0
 */
public class InfoColleageIterator implements Iterator {
    // 信息工程学院是以List方式存放系
    List<Department> departments;
    int index = -1;

    public InfoColleageIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        }
        index++;
        return true;
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public void remove() {

    }
}
