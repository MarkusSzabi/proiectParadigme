package Problema5;

public class Problema5 {


    public static void main(String[] args) {

        Person persoana = new Person();
        persoana.setName("Marian");
        persoana.setEmail("marian@marian.com");

        Student student = new Student();
        student.setName("Mihai");
        student.setEmail("mihai@mihai.com");
        int[] grades = {21 ,213 ,241};
        student.setGrades(grades);


        Profesor profesor = new Profesor();
        profesor.setName("Marius");
        profesor.setEmail("marius@marius.com");
        String[] courses = new String[]{"Matematic" , "Biologie" , "Fizica"};
        profesor.setCourses(courses);


        System.out.println("Person " + persoana.getName()+" " + persoana.getEmail());
        System.out.println("Student " + student.getName() +" "+ student.getEmail() + student.printGrades());
        System.out.println("Profesor " + profesor.getName() +" " + profesor.getEmail() + profesor.printCourses());

    }
}
