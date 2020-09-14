package com.yuan.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * 手记的纪念品管理者。
 *
 * @ClassName ArticleMementoManager
 * @Author Administrator
 * @Date 2020/9/14 21:54
 */
public class ArticleMementoManager {
    // 先进后出。
    private final Stack<ArticleMemento> stack = new Stack<ArticleMemento>();

    public ArticleMemento getMemento() {
        ArticleMemento articleMemento = stack.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento memento) {
        stack.push(memento);
    }
}
