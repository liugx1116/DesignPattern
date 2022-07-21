package com.atgx.uml.composition;

/**
 * @author lgx
 * 组合关系
 * @date 2022/6/249:04
 */
public class Person {
    private IDCard card; //聚合关系
    private Head head = new Head();//组合关系
}
