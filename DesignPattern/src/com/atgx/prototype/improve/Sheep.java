package com.atgx.prototype.improve;

/**
 * @author lgx
 * @description: 原型模式
 * @date 2022/7/512:32
 */
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address;
    public Sheep friend ; //是对象, 克隆是会如何处理

    public Sheep(String name, int age, String color, String address) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.address = address;
    }
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sheep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
