package Problema3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cate numere doriti sa afisati?");
        int n = input.nextInt();

        int t1 = 0 , t2= 1, t3=0;

        System.out.println(t1+ " " +t2);

        for(int i = 2 ; i < n ; i++){
            t3 = t1 + t2;
            if(t3 < n){
                System.out.println(" "+ t3 );
            }
            t1 = t2;
            t2 = t3;
        }

    }
}
