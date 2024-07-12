package org.example.ci_with_collection;

import java.util.*;
public class Person {
    private final String name;
    List<String> phones;
    Set<String> courses;
    Map<String,String> address;

    public Person(String name, List<String> phones, Set<String> courses, Map<String, String> address) {
        this.name = name;
        this.phones = phones;
        this.courses = courses;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", courses=" + courses +
                ", address=" + address +
                '}';
    }
}
