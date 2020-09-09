package com.yuan.design.pattern.behavioral.interpreter;

/**
 * @ClassName MultiInterpreter
 * @Author Administrator
 * @Date 2020/9/9 22:15
 */
public class MultiInterpreter implements Interpreter {
    private Interpreter firstExpression, secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    public int interpert() {
        return this.firstExpression.interpert() * this.secondExpression.interpert();
    }

    @Override
    public String toString() {
        return "*";
    }
}
