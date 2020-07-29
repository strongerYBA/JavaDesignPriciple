package com.yuan.design.pattern.structural.composite;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/4/20 23:09
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("linux课程",11);
        CatalogComponent windowsCourse = new Course("windows课程",101);
        CatalogComponent javaCourseCatalog = new CourseCatalog("java课程目录",2);
        CatalogComponent mmallCourse1 = new Course("Java电商一期",55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期",100);
        CatalogComponent designPattern = new Course("Java设计模式",77);
        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);
        CatalogComponent immocMainCourseCatalog = new CourseCatalog("慕课网课程主目录",1);
        immocMainCourseCatalog.add(linuxCourse);
        immocMainCourseCatalog.add(windowsCourse);
        immocMainCourseCatalog.add(javaCourseCatalog);
        immocMainCourseCatalog.print();
    }
}
