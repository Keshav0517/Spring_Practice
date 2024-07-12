package org.example.stereotype_with_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("stereotype_with_collection config.xml");
        Person p=context.getBean("person",Person.class);
        System.out.println(p);
        System.out.println(p.getAddress());
        System.out.println(p.getAddress().getClass().getName());
    }
}
