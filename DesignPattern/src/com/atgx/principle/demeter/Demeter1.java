package com.atgx.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgx
 * @description: 迪米特法则
 * @date 2022/6/228:46
 */
public class Demeter1 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        //输出学院的员工id 和  学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工类
class Employee{
    
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
// 学院员工类
class ColleageEmployee{
    private String id;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
// 学院员工的管理类
class CollegeManager{
    
    // 返回学院的所有员工
    public List<ColleageEmployee> getAllEmployee(){
        List<ColleageEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) { //这里我们增加了10个员工到 list
            ColleageEmployee colleageEmployee = new ColleageEmployee();
            colleageEmployee.setId("学院员工id= " + i);
            list.add(colleageEmployee);
        }
        return list;
    }
}
// 出现 成员变量， 方法参数， 方法返回值中的类为直接的朋友，而出现在 局部变量中的类不是直接的朋友
//分析 SchoolManager 类的直接朋友类有哪些 Employee、CollegeManager
//CollegeEmployee 不是 直接朋友 而是一个陌生类，这样违背了 迪米特法则
// 学校管理类
class SchoolManager{
    //返回学校总部的员工
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工id= "+i);
            list.add(employee);
        }
        return list;
    }
    //该方法完成输出学校总部和学院员工信息(id)
    public void printAllEmployee(CollegeManager sub){
        // 分许问题
        // 1. 这里的 ColleageEmployee 不是 SchoolManager的直接朋友
        // 2. ColleageEmployee 以局部变量的方式出现在 SchoolManager
        // 3. 违背了 迪米特法则

        //获取到学院员工
        List<ColleageEmployee> list1 = sub.getAllEmployee();
        System.out.println("------------学院员工------------");
        for (ColleageEmployee e : list1) {
            System.out.println(e.getId());
        }
        //获取到学校总部员工
        List<Employee> allEmployee = this.getAllEmployee();
        for (Employee employee : allEmployee) {
            System.out.println(employee.getId());
        }
    }
}