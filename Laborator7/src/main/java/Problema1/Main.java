package Problema1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Cont> banca = new ArrayList<>();

        ContBancar contBancar = new ContBancar(200);
        banca.add(contBancar);

        ContDeCredit contDeCredit = new ContDeCredit(500);
        banca.add(contDeCredit);

        ContDeEconomii contDeEconomii = new ContDeEconomii(100);
        banca.add(contDeEconomii);

        banca.stream().forEach((cont) -> System.out.println(cont));


        contBancar.withdraw(500);
        System.out.println(contBancar.getBalance());
        contBancar.deposit(1000);
        System.out.println(contBancar.toString());

        System.out.println();

        contDeEconomii.withdraw(80);
        System.out.println(contDeEconomii.getBalance());
        contDeEconomii.deposit(500);
        System.out.println(contDeEconomii.toString());

    }
}
