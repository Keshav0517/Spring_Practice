package org.example.auto_wiring_using_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("auto_wiring_annotation config.xml");
        Student stud=context.getBean("student",Student.class);
        System.out.println(stud);
    }
}
