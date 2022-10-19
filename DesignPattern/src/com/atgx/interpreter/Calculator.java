package com.atgx.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Author: liugx
 * @CreateTime: 2022-10-12  09:30
 * @Description: 解释器模式
 * @Version: 1.0
 */
public class Calculator {

    private Expression expression;

    // 构造函数传参，并解析 expStr = a+b
    public Calculator(String expStr) {
        // 安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分成字符数组  // [a, +, b]
        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    // 取出右表达式 "b"
                    left = stack.pop();
                    // 然后根据得到left 和 right 构建 AddExpresson加入stack
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    //如果是一个 Var 就创建要给 VarExpression 对象，并push到 stack
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
            //当遍历完整个 charArray 数组后，stack 就得到最后Expression
        }
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var){
        //最后将表达式a+b和 var = {a=10,b=20}
        //然后传递给expression的interpreter进行解释执行
        return this.expression.interpreter(var);
    }
}
