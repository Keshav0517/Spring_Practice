package org.example.remove_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
       Student s=context.getBean("student",Student.class);
       s.study();


    }
}
