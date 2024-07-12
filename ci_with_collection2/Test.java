package org.example.ci_with_collection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ci_with_collection2_config.xml");
        Questions q=(Questions) context.getBean("question");
        q.displayInfo();
    }
}
