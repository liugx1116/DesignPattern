package com.atgx.interpreter;

import java.util.HashMap;

/**
 * @Author: liugx
 * @CreateTime: 2022-10-12  11:57
 * @Description: 加法解释器
 * @Version: 1.0
 */
public class SubExpression extends SymbolExpression{

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
