package org.example.life_cycle_methods_annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("life_cycle_methods_using_annotation config.xml");
        Student student=(Student) context.getBean("s1");
        System.out.println(student);
        context.registerShutdownHook();

    }
}
