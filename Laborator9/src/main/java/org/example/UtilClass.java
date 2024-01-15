package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class UtilClass {

    private Product product;

    public UtilClass() {

    }

    public void adaugaFisier( Product product) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("util.json"), product );

    }

    public void citesteFisier(Product product) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.readValue(Paths.get("util.json").toFile() , Product.class);
    }

    public void adaugaFisier(List products) throws  IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        for(int i = 0 ; i< products.size() ; i++){
            objectMapper.writeValue(new File("util.json"), products.get(i).toString());
        }

    }

    public void citesteFisier(List products) throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonProductCarry = "";
        List<Product> listProduct = objectMapper.readValue(jsonProductCarry, new TypeReference<List<Product>>() {
        });

        listProduct.toString();

    }
}
