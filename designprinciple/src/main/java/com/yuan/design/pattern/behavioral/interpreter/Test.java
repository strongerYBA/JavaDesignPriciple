package com.yuan.design.pattern.behavioral.interpreter;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/9/9 21:55
 */
public class Test {
    public static void main(String[] args) {
        String inputStr = "6 100 11 + *";// (100+11)*6
        GeelyExpressionParser expressionParser = new GeelyExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println("解释器计算结果：" + result);
    }
}
