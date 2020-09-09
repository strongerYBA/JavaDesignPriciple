package com.yuan.design.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * @ClassName GeelyExpressionParser
 * @Author Administrator
 * @Date 2020/9/9 22:21
 */
public class GeelyExpressionParser {
    // 栈，先进后出。
    private Stack<Interpreter> stack = new Stack<Interpreter>();

    public int parse(String str) {
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray) {
            if (!OperatorUtil.isOperator(symbol)) {
                // 创建数字解释器。
                Interpreter numberExpression = new NumberInterpreter(symbol);
                // 数字直接入栈。
                stack.push(numberExpression);
                System.out.printf("入栈：%d", numberExpression.interpert());
                System.out.println();
            } else {
                // 是运算符，可以计算。
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.printf("出栈：%d和%d", firstExpression.interpert(), secondExpression.interpert());
                System.out.println();
                Interpreter interpreter = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                int result = interpreter.interpert();
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈：%d", resultExpression.interpert()));
            }
        }
        int pop = stack.pop().interpert();
        return pop;
    }
}
