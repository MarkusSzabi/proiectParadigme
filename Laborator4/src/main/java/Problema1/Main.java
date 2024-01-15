package Problema1;
import java.util.Scanner;

public class Main {

    public static String CaracterMijloc(String cuvant){
        int cuvant_lenght = cuvant.length();

        String mijloc;

        if(cuvant_lenght % 2 == 0) {
            mijloc = new StringBuilder().append(cuvant.charAt(cuvant_lenght/2-1)).append(cuvant.charAt(cuvant_lenght/2)).toString();
            return  mijloc;
        }
        mijloc = new StringBuilder().append(cuvant.charAt(cuvant_lenght/2)).toString();
        return mijloc;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuvant: ");
        String cuvant = input.nextLine();
        System.out.println(CaracterMijloc(cuvant));

    }
}