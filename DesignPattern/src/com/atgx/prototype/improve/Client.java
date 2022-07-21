package com.atgx.prototype.improve;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/512:38
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色", "哈哈哈");
        sheep.friend = new Sheep("jack", 2, "黑色","黑黑");
        Sheep sheep2 = (Sheep)sheep.clone(); //克隆
        Sheep sheep3 = (Sheep)sheep.clone(); //克隆
        Sheep sheep4 = (Sheep)sheep.clone(); //克隆
        Sheep sheep5 = (Sheep)sheep.clone(); //克隆

        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());
        System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());
        System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());
        System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());
    }
}
