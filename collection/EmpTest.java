package org.example.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("collection config.xml");
        Employee employee1=(Employee) context.getBean("employee1");
        System.out.println("Employee name:"+employee1.getName());
        System.out.println("Employee phones:"+employee1.getPhones());
        System.out.println("Employee addresses:"+employee1.getAddresses());
        System.out.println("Employee courses:"+employee1.getCourses());
    }
}
