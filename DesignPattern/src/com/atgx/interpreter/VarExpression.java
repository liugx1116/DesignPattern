package com.atgx.interpreter;

import java.util.HashMap;

/**
 * @Author: liugx
 * @CreateTime: 2022-10-12  11:52
 * @Description: 变量的解释器
 * @Version: 1.0
 */
public class VarExpression extends Expression{

    // key=a,key=b,key=c
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        // 根据 变量名称，返回对应值
        return var.get(key);
    }
}
