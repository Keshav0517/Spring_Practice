package org.example.ambiguity_solution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ambiguity_solution_with_ci config.xml");
        Addition add =(Addition) context.getBean("addition");
        add.doSum();
    }
}
