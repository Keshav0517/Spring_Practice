package org.example.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("reference config.xml");
        Student student=(Student) context.getBean("stud_ref");
        System.out.println(student.getName());
        System.out.println(student.getId());
        System.out.println(student.getAddress());

        System.out.println();

        Address address=(Address) context.getBean("aref");
        System.out.println(address.getCity());
        System.out.println(address.getPinCode());

    }
}
