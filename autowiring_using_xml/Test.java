package org.example.autowiring_using_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("auto_wiring config.xml");
        Employee emp=context.getBean("e1",Employee.class);
        System.out.println(emp);
    }
}
