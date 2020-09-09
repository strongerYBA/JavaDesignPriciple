package com.yuan.design.pattern.behavioral.interpreter;

/**
 * @ClassName NumberInterpreter
 * @Author Administrator
 * @Date 2020/9/9 22:17
 */
public class NumberInterpreter implements Interpreter {
    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    public int interpert() {
        return this.number;
    }
}
