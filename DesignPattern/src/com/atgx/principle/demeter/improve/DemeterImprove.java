package com.atgx.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgx
 * @description: 迪米特法则
 * @date 2022/6/229:21
 */
public class DemeterImprove {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }

}
//学校总部员工类
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}


//学院的员工类
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
//管理学院员工的管理类
class CollegeManager {
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        System.out.println("------------学院员工------------");
        for (int i = 0; i < 10; i++) { //这里我们增加了10个员工到 list
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    // 输出学院员工信息
    public void printEmployee(){
        List<CollegeEmployee> allEmployee = getAllEmployee();
        for (CollegeEmployee collegeEmployee : allEmployee) {
            System.out.println(collegeEmployee.getId());
        }

    }
}
//学校管理类
//分析 SchoolManager 类的直接朋友类有哪些 Employee、CollegeManager
//CollegeEmployee 不是 直接朋友 而是一个陌生类，这样违背了 迪米特法则
class SchoolManager{
    //返回学校总部的员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < 5; i++) { //这里我们增加了5个员工到 list
            Employee emp = new Employee();
            emp.setId("学校总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }
    //该方法完成输出学校总部和学院员工信息(id)
    public void printAllEmployee(CollegeManager cm){
        //1. 将输出学院的员工方法，封装到CollegeManager
        cm.printEmployee();
        //获取到学校总部员工
        List<Employee> allEmployee = getAllEmployee();
        System.out.println("------------学校总部员工------------");
        for (Employee employee : allEmployee) {
            System.out.println(employee.getId());
        }
    }

}