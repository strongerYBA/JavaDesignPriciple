package com.yuan.design.pattern.behavioral.chainofresponsibility;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/10/13 10:24
 */
public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();
        Course course = new Course();
        course.setName("java 课程");
        course.setArticle("java 课程手记");
        course.setVideo("java 课程视频");
        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
