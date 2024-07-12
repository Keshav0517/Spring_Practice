package org.example.lifecycle_methods_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean , DisposableBean {
    private int id;

    public void setId(int id){
        System.out.println("Setting Id of Employee");
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public Employee(){
        super();
    }

    public String toString(){
        return ("Id:"+this.id);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside Init():");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside Destroy():");
    }
}
