package org.example.ci_with_collection2;

import java.util.Iterator;
import java.util.List;

public class Questions {
    private int id;
    private String name;
    private List<Answer> answers;

    public Questions(int id,String name,List<Answer> answers){
        super();
        this.id=id;
        this.name=name;
        this.answers=answers;
    }

    public Questions(){

    }

    public void displayInfo(){
        System.out.println(id+" "+name);
        System.out.println("Answers");
        Iterator<Answer> itr=answers.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
