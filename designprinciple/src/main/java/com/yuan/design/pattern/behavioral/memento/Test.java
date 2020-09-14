package com.yuan.design.pattern.behavioral.memento;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/9/14 22:19
 */
public class Test {
    public static void main(String[] args) {
        ArticleMementoManager mementoManager = new ArticleMementoManager();
        Article article = new Article("如影随形的java设计模式A", "备忘录模式A", "123A.jpg");
        ArticleMemento memento = article.saveToMemento();
        mementoManager.addMemento(memento);
        System.out.println("标题：" + article.getTitle() + "内容：" + article.getContent() + "图片：" + article.getImgs() + "暂存成功");
        System.out.println("手记完整信息：" + article);

        System.out.println("修改手记start");

        article.setTitle("如影随形的java设计模式B");
        article.setContent("备忘录模式B");
        article.setImgs("123B.jpg");

        System.out.println("修改手记end");
        System.out.println("手记完整信息：" + article);
        memento = article.saveToMemento();
        mementoManager.addMemento(memento);
        article.setTitle("如影随形的java设计模式c");
        article.setContent("备忘录模式c");
        article.setImgs("123C.jpg");

        System.out.println("暂存回退start");
                System.out.println("回退出栈1次");
                memento = mementoManager.getMemento();
                article.undoFromMemento(memento);
                System.out.println("Article = "+article);
                System.out.println("回退出栈2次");
                memento = mementoManager.getMemento();
                article.undoFromMemento(memento);
                System.out.println("Article = "+article);
                }
                }
