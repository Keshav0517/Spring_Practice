package org.example.lifecycle_methods_interface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("life_cycle_methods_using_interface config.xml");
        Employee emp=(Employee) context.getBean("e1");
        context.registerShutdownHook();
        System.out.println(emp);

    }
}
