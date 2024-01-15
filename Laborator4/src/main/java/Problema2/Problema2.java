package Problema2;

import java.util.Scanner;

public class Problema2 {

    public static int sumaCifre(int numar){
        int suma = 0;
        while(numar !=0){
            suma = suma + numar%10;
            numar = numar / 10;
        }

        return suma;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Numar: ");
        int numar = input.nextInt();

        System.out.println("Suma cifrelor este = " + sumaCifre(numar));
    }
}
