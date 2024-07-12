package org.example.ci_inheriting_bean;

public class Address {
    private final String addressLine1;
    private final String city;
    private final String state;
    private final String country;

    public Address(String addressLine1, String city, String state, String country) {
        super();
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    public String toString(){
        return addressLine1+" "+city+" "+state+" "+country;
    }

}
