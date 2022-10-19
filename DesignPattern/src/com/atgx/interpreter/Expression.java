package com.atgx.interpreter;

import java.util.HashMap;

/**
 * @Author: liugx
 * @CreateTime: 2022-10-12  11:48
 * @Description: 表达式
 * 抽象类表达式，通过HashMap 键值对, 可以获取到变量的值
 * @Version: 1.0
 */
public abstract class Expression {
    /**
     * a + b - c HashMap {a=10, b=20}
     * @param var  解释公式和数值, key 就是公式(表达式) 参数[a,b,c], value就是就是具体值
     * @return
     */
    public abstract int interpreter(HashMap<String,Integer> var);
}
