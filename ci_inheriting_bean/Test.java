package org.example.ci_inheriting_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ci_with_inheritance_config.xml");
       Employee s=(Employee) context.getBean("e2");
        s.show();
    }
}
