package com.atgx.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 打印
 */
public class OutPutImpl {
    List<College> collegeList;
    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }
    //遍历所有学院,然后调用printDepartment 输出各个学院的系
    public void pringColeage(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            //  取出一个学院
            College college = iterator.next();
            System.out.println("=== "+college.getName() +"=====" );
            printDepartment(college.createIterator());
        }
    }

    // 输出学院 输出系
    private void printDepartment(Iterator iterato){
        while (iterato.hasNext()){
            Department department = (Department)iterato.next();
            System.out.println(department.getName());
        }
    }
}
