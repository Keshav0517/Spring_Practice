package org.example.qualifier_annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("qualifier_annotation_config.xml");
        Student stud=context.getBean("student",Student.class);
        System.out.println(stud);
    }
}
