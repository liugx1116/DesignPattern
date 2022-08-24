package com.atgx.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: liugx
 * @CreateTime: 2022-08-19  09:09
 * @Description: TODO
 * @Version: 1.0
 */
public class InfoColleageIterator implements Iterator {
    // 信息工程学院是以List方式存放系
    List<Department> departments;
    int index = -1;

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
