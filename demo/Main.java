package org.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Spring Tutorial..!");
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student student1=(Student) context.getBean("student1");
        System.out.println(student1);

        System.out.println();

        Student student2=(Student) context.getBean("student2");
        System.out.println(student2);

        System.out.println();

        Student student3=(Student) context.getBean("student3");
        System.out.println(student3);

    }
}