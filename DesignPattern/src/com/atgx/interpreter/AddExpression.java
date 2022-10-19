package com.atgx.interpreter;

import java.util.HashMap;

/**
 * @Author: liugx
 * @CreateTime: 2022-10-12  11:59
 * @Description: TODO
 * @Version: 1.0
 */
public class AddExpression extends SymbolExpression{

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        //super.left.interpreter(var) ： 返回 left 表达式对应的值 a = 10
        //super.right.interpreter(var): 返回right 表达式对应值 b = 20
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
