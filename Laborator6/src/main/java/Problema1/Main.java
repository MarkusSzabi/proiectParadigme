package Problema1;

import java.util.ArrayList;
import java.util.List;
import  java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Random rnd = new Random();
        Scanner input = new Scanner(System.in);



        Car car1 = new Car("Audi" , rnd.nextInt() , "A5");
        vehicles.add(car1);
        Car car2 = new Car("BMW" , rnd.nextInt() , "A2");
        vehicles.add(car2);
        Car car3 = new Car("Lexus" , rnd.nextInt() , "Ceva marca");
        vehicles.add(car3);

        Bicycle bike1 = new Bicycle("Pegas" , rnd.nextInt() , "cu pedale");
        vehicles.add(bike1);
        Bicycle bike2 = new Bicycle("BTWIN" , rnd.nextInt() , "cu pedale 2");
        vehicles.add(bike2);
        Bicycle bike3 = new Bicycle("Rockrider" , rnd.nextInt() , "520");
        vehicles.add(bike3);


        System.out.println(vehicles);

//
//        System.out.println("Numar vehicule: ");
//        int nr_vehicule = input.nextInt();



//        for(int i = 0 ; i<nr_vehicule ; i++){
//            System.out.println("1. Masina / 2. Bicicleta");
//            int optiune = input.nextInt();
//
//            switch (optiune){
//                case 1:{
//                    Car car = new Car()
//                }
//            }
//        }

    }
}
