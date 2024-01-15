package Problema1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Precizati numarul de angajati: ");
        int nr_ingajati = input.nextInt();

        for(int i = 0 ; i<nr_ingajati ; i++){



            System.out.println("Nume: ");
            input.nextLine();
            String nume = input.nextLine();



            System.out.println("Email: ");
            String email = input.nextLine();


            System.out.println("HourRate: ");
            double hourRate = input.nextDouble();


            System.out.println("Capacity: ");
            double capacity = input.nextDouble();


            System.out.println("FreeDays: ");
            int freeDays = input.nextInt();

            Employee emp = new Employee(nume , email , hourRate , capacity , freeDays);

            employees.add(emp);
            System.out.println(emp);


        }

        System.out.println(employees);

    }
}
