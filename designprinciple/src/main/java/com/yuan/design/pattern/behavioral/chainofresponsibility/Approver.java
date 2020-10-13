package com.yuan.design.pattern.behavioral.chainofresponsibility;

/**
 * 批准者。
 *
 * @ClassName Approver
 * @Author Administrator
 * @Date 2020/10/13 10:14
 */
public abstract class Approver {
    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
