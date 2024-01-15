package Problema2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce-ti numere de elemente din sir");
        int n = input.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i< n  ; i++){
            System.out.println("arr[" + i + "]= " );
            arr[i] = input.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            boolean isPrime = true;


            for (int d=2 ; d<arr[i]/2; d++){

                if(arr[i]%d==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)

                System.out.println(arr[i] + " ");
        }

    }
}
