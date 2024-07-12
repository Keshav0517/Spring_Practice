package org.example.remove_xml_using_bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.example.remove_xml_using_bean_annotation.Student")
public class JavaConfig {
    @Bean
    public Student getStudent(){
        return new Student();
    }
}
