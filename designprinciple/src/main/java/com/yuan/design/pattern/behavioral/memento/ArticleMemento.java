package com.yuan.design.pattern.behavioral.memento;

/**
 * 手记memento类。快照。
 *
 * @ClassName ArticleMemento
 * @Author Administrator
 * @Date 2020/9/14 21:53
 */
public class ArticleMemento {
    private String title;
    private String content;
    private String imgs;

    public ArticleMemento(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    @Override
    public String toString() {
        return "ArticleMemento{" + "title=" + title + "\'" + ",content=" + content + "\'" + ",imgs=" + imgs + "\'" + "}";
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImgs() {
        return imgs;
    }
}
