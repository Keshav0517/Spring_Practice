package org.example.ci_with_ref;

public class Student {
    private final String name;
    private final int id;
    private final Address address;

    public Student(String name,int id,Address address){
        this.name=name;
        this.id=id;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}
