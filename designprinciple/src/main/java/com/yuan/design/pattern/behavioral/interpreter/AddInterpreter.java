package com.yuan.design.pattern.behavioral.interpreter;

/**
 * @ClassName AddInterpreter
 * @Author Administrator
 * @Date 2020/9/9 22:11
 */
public class AddInterpreter implements Interpreter {
    private Interpreter firstExpression, secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    public int interpert() {
        return this.firstExpression.interpert() + this.secondExpression.interpert();
    }

    @Override
    public String toString() {
        return "+";
    }
}
