package org.example.invoke_static_method_spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("invoke_static_method_spel config.xml");
        Student student=context.getBean("student",Student.class);
        System.out.println(student);
    }
}
