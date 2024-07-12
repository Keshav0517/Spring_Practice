package org.example.autowiring_using_xml;

public class Address {
    private String street;
    private String city;

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public Address() {
        super();
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
