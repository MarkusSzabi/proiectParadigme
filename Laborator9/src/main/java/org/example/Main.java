package org.example;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        UtilClass utilClass = new UtilClass();
        List<Product> products = new ArrayList<>();
        for(int i = 0  ; i < 10 ; i++){
            Product productI = new Product("prod " +  i  , i);
            products.add(productI);
        }
        utilClass.adaugaFisier(products);

    }

    }
