package org.example.auto_wiring_using_annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

//    @Autowired
    private MarkSheet markSheet;

    public MarkSheet getMarkSheet() {
        return markSheet;
    }

//    @Autowired
    public void setMarkSheet(MarkSheet markSheet) {
        this.markSheet = markSheet;
    }

    @Autowired
    public Student(MarkSheet markSheet) {
        this.markSheet = markSheet;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "markSheet=" + markSheet +
                '}';
    }
}
