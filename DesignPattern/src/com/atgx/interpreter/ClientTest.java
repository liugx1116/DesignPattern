package com.atgx.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @Author: liugx
 * @CreateTime: 2022-10-12  15:56
 * @Description: 解释器模式
 * @Version: 1.0
 */
public class ClientTest {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + "=" + calculator.run(var));
    }

    // 获得表达式
    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    // 获得值映射
    public static HashMap<String,Integer> getValue(String expStr) throws IOException {
        HashMap<String,Integer> map = new HashMap<>();

        for (char ch : expStr.toCharArray()) {
            if(ch != '+' && ch != '-'){
               if(!map.containsKey(String.valueOf(ch))){
                   System.out.print("请输入" + String.valueOf(ch) + "的值：");
                   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                   String in = bufferedReader.readLine();
                   map.put(String.valueOf(ch),Integer.valueOf(in));
               }
            }
        }
        return map;
    }
}
