package com.atgx.composite;

public class Client {
    public static void main(String[] args) {
        // 创建大学
        University university = new University("航空航天大学", "中国顶级大学");

        // 创建学院
        College computerCollege = new College("计算机学院","计算机学院不错");
        College infoENgineerCollege = new College("信息工程学院","信息工程学院");

        // 创建系 （专业）
        computerCollege.add(new Department("软件工程","软件工程不错"));
        computerCollege.add(new Department("网络工程","网络工程不错"));
        computerCollege.add(new Department("计算机与科学技术","计算机与科学技术不错"));

        infoENgineerCollege.add(new Department("通信工程","通信工程还可以"));
        infoENgineerCollege.add(new Department("信息工程","信息工程还可以"));

        university.add(computerCollege);
        university.add(infoENgineerCollege);
        university.print();

    }
}
