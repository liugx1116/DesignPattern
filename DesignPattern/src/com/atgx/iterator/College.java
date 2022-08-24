package com.atgx.iterator;

import java.util.Iterator;

/**
 * @Author: liugx
 * @CreateTime: 2022-08-19  09:21
 * @Description: 学院
 * @Version: 1.0
 */
public interface College {
    public String getName();
    //增加系的方法
    public void addDepartment(String name, String desc);
    //返回一个迭代器,遍历
    public Iterator createIterator();
}
