package com.yuan.design.pattern.behavioral.memento;

/**
 * @ClassName Article
 * @Author Administrator
 * @Date 2020/9/14 21:53
 */
public class Article {
    private String title;
    private String content;
    private String imgs;

    public Article(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    // 保存到ArticleMemento对象。
    public ArticleMemento saveToMemento() {
        ArticleMemento memento = new ArticleMemento(this.title, content, imgs);
        return memento;
    }

    // 进行回退。从ArticleMemento获得值，对当前对象进行赋值。
    public void undoFromMemento(ArticleMemento memento) {
        this.title = memento.getTitle();
        this.content = memento.getContent();
        this.imgs = memento.getImgs();
    }

    @Override
    public String toString() {
        return "Article{" + "title=" + title + "\'" + ",content=" + content + "\'" + ",imgs=" + imgs + "\'" + "}";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }
}
