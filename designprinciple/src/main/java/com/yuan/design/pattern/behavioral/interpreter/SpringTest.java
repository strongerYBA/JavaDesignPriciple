package com.yuan.design.pattern.behavioral.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @ClassName SpringTest
 * @Author Administrator
 * @Date 2020/9/9 23:16
 */
public class SpringTest {
    public static void main(String[] args) {
        // spring el 表达式。
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100*2+400*1+66");
        Integer value = (Integer) expression.getValue();
        System.out.println(value);
    }
}
