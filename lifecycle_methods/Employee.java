package org.example.lifecycle_methods;

public class Employee {
    private String name;

    public void setName(String name){
        System.out.println("Setting name of Employee");
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public Employee(){
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public void init(){
        System.out.println("Inside Init method");
    }

    public void destroy(){
        System.out.println("Inside destroy method");
    }
}
