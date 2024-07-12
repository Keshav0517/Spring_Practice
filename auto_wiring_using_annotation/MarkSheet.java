package org.example.auto_wiring_using_annotation;

public class MarkSheet {
    private int physicMark;
    private int chemistryMark;
    private int mathMark;

    public int getPhysicMark() {
        return physicMark;
    }

    public void setPhysicMark(int physicMark) {
        this.physicMark = physicMark;
    }

    public int getChemistryMark() {
        return chemistryMark;
    }

    public void setChemistryMark(int chemistryMark) {
        this.chemistryMark = chemistryMark;
    }

    public int getMathMark() {
        return mathMark;
    }

    public void setMathMark(int mathMark) {
        this.mathMark = mathMark;
    }

    public MarkSheet(int physicMark, int chemistryMark, int mathMark) {
        this.physicMark = physicMark;
        this.chemistryMark = chemistryMark;
        this.mathMark = mathMark;
    }

    public MarkSheet() {
        super();
    }

    @Override
    public String toString() {
        return "MarkSheet{" +
                "physicMark=" + physicMark +
                ", chemistryMark=" + chemistryMark +
                ", mathMark=" + mathMark +
                '}';
    }


}
