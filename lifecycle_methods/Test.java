package org.example.lifecycle_methods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("life_cycle_methods config.xml");
        Employee emp=(Employee) context.getBean("e1");
        System.out.println(emp);
        context.registerShutdownHook();
    }
}
