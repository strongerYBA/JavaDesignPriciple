package com.yuan.design.pattern.behavioral.observer;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/9/14 21:07
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("java设计模式");
        Teacher teacher1 = new Teacher("yuan");
        Teacher teacher2 = new Teacher("bi");
        course.addObserver(teacher1);
        course.addObserver(teacher2);
        // 业务逻辑。
        Question question = new Question();
        question.setUserName("Geeley");
        question.setQuestionContent("java 如何编程！");
        course.produceQuestion(course, question);

    }

}
