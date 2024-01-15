package Problema4;

import java.util.Scanner;

public class Main {

    public static boolean isOgl(int n ){
        int ogl = 0;
        int cpy = n;
        while(n!=0){
            ogl = ogl * 10 + n % 10;
            n = n/10;
        }

        if(ogl == cpy){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dati numar: ");
        int n = input.nextInt();

        if (isOgl(n)) {
            System.out.println("Este numar palindrom");
        }else{
            System.out.println("Nu este numar palindrom");
        }


    }
}
