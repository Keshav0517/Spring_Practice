package org.example.autowiring_using_xml;

public class Employee {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setting address");
        this.address = address;
    }

    public Employee(Address address) {
        this.address = address;
        System.out.println("Inside Constructor");
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
