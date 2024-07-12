package org.example.remove_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
    public void study(){
        System.out.println("Reading Book");
    }
}
