package org.example.inject_depen_using_bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
//        Student s=context.getBean("getStudent",Student.class);
//        Student s=context.getBean("student",Student.class);
        Student s=context.getBean("temp",Student.class);
        s.study();

    }
}
