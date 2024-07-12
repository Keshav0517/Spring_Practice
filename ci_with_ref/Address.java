package org.example.ci_with_ref;

public class Address {
    private final String city;
    private final String state;
    private final String area;

    public Address(String city, String state, String area) {
        this.city = city;
        this.state = state;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
