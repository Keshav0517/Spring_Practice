package org.example.invoke_static_method_spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Student {
    @Value("#{20+30}")  //Primitive type expression
    private int x;
    @Value("#{30+30}")   //Primitive type expression
    private int y;

    @Value("#{ T(java.lang.Math).sqrt(25) }") //Static method of Math class using SpEL
    private int z;

    @Value("#{ T(java.lang.Math).PI}") //Static Variable of Math class using SpEL
    private double pi;
    @Value("#{T(java.lang.Math).E}")  //Static Variable of Math class using SpEL
    private double e;
    @Value("#{ new java.lang.String('Keshav')}")  //Creating an Object of String
    private String name;

    @Value("#{new java.util.Date()}")
    private Date todayDate;
    @Value("#{8>3}")      //boolean value
    private boolean isActive;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getE(){
        return e;
    }

    public void setE(double e){
        this.e=e;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", pi=" + pi +
                ", e=" + e +
                ", name='" + name + '\'' +
                ", todayDate='" + todayDate + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
