package org.example.standalone_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("standalone_collection config.xml");
        Person p=context.getBean("person1",Person.class);
        System.out.println(p);
        System.out.println(p.getFriends().getClass().getName());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(p.getFeesStructure());
        System.out.println(p.getFeesStructure().getClass().getName());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
