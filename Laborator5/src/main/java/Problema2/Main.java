package Problema2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> formeGeometrice = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int numar_forme;
        System.out.println("Precizati numarul de forme: ");
        numar_forme = input.nextInt();


        for(int i = 0 ; i<numar_forme ; i++){
            System.out.println("Precizati forma 1 - Patrulater / 2 - Cerc / 3 - Triunghi");
            int optiune = input.nextInt();

            switch (optiune){
                case 1:{
                    System.out.println("Lungime: ");
                    double lungime = input.nextDouble();

                    System.out.println("Latime: ");
                    double latime = input.nextDouble();

                    Patrulater patrulater = new Patrulater(lungime , latime);
                    formeGeometrice.add(patrulater);
                    break;
                }

                case 2:{
                    System.out.println("Raza: ");
                    double raza = input.nextDouble();

                    Cerc cerc = new Cerc(raza);
                    formeGeometrice.add(cerc);
                    break;
                }

                case 3:{
                    System.out.println("Latura1: ");
                    double latura1 = input.nextDouble();

                    System.out.println("Latura2: ");
                    double latura2 = input.nextDouble();

                    System.out.println("Latura3: ");
                    double latura3 = input.nextDouble();

                    Triunghi triunghi = new Triunghi(latura1 , latura2 , latura3);
                    formeGeometrice.add(triunghi);
                    break;
                }

                default:{
                    System.out.println("Nu ati introdus o optiune corecta");
                }
            }
        }

        System.out.println(formeGeometrice);
    }
}
