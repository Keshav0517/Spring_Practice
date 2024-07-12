package org.example.singleton_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("singleton_scope config.xml");
        Student student=context.getBean("student1",Student.class);
        System.out.println(student);
        System.out.println(student.hashCode());

        Student student1=context.getBean("student1",Student.class);
        System.out.println(student1.hashCode());
    }
}
