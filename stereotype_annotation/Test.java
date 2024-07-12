package org.example.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("stereotype_annotation config.xml");
        Student stud=context.getBean("student",Student.class);
        System.out.println(stud);

    }
}
