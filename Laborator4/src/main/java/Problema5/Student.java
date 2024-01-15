package Problema5;

import java.util.Arrays;

public class Student extends Person {
    private int[] grades;

    public int[] getGrades() {
        return this.grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String printGrades() {
        return Arrays.toString(grades);
    }


}
