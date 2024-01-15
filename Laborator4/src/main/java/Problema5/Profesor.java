package Problema5;

import java.util.Arrays;

public class Profesor extends Person {

    private String[] courses;

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String printCourses(){
        return Arrays.toString(courses);
    }
}
