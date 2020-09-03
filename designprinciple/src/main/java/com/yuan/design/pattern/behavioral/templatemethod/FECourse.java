package com.yuan.design.pattern.behavioral.templatemethod;

/**
 * @ClassName FECourse
 * @Author Administrator
 * @Date 2020/9/3 22:09
 */
public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;

    void packageCourse() {
        System.out.println("提供课程前端代码！");
        System.out.println("提供课程的图片等多媒体素材！");
    }

    //此时又产生了如下场景：前端VUE要写手记，react不需要写手记，怎么办？可以定义一个标记，开放给应用层，来确定是否写手记：
    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
