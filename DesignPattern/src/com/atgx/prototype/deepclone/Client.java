package com.atgx.prototype.deepclone;

import org.junit.jupiter.api.Test;

/**
 * @author lgx
 * @description: 深拷贝
 * @date 2022/7/189:19
 */
public class Client {

    public static void main(String[] args) throws Exception {
        DeepProtoType dp = new DeepProtoType();
        dp.name = "张飞";
        dp.deepCloneableTarget = new DeepCloneableTarget("大牛","小牛");
        //方式1 完成深拷贝
        DeepProtoType dp1 = (DeepProtoType)dp.clone();
		System.out.println("dp.name=" + dp.name + "p.deepCloneableTarget=" + dp.deepCloneableTarget.hashCode());
		System.out.println("dp1.name=" + dp1.name + "dp1.deepCloneableTarget=" + dp1.deepCloneableTarget.hashCode());

    }

    @Test
    public void test1(){
        DeepProtoType dp = new DeepProtoType();
        dp.name = "张飞";
        dp.deepCloneableTarget = new DeepCloneableTarget("大牛","小牛");
        //方式2 完成深拷贝
        DeepProtoType dp1 = (DeepProtoType)dp.deepClone();
        System.out.println("dp.name=" + dp.name + "p.deepCloneableTarget=" + dp.deepCloneableTarget.hashCode());
        System.out.println("dp1.name=" + dp1.name + "dp1.deepCloneableTarget=" + dp1.deepCloneableTarget.hashCode());

    }
}
