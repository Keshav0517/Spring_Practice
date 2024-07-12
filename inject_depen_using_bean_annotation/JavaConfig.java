package org.example.inject_depen_using_bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public Address getAddress(){
        return new Address();
    }


    @Bean(name = {"student","temp","con"})
    public Student getStudent(){
        return new Student(getAddress());
    }

}
