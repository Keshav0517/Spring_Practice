package org.example.inject_depen_using_bean_annotation;

public class Student {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(Address address) {
        this.address = address;
    }


    public void study(){
        this.address.display();
        System.out.println("Reading Book!");
    }
}
