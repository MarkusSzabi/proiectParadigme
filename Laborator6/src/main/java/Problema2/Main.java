package Problema2;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        int nr[] = {2 ,5 ,2 ,9 ,1 ,4 ,3 ,9 ,1};


        for(int i = 0 ; i < nr.length ; i++){
            set.add(nr[i]);
            list.add(nr[i]);

        }

        Collections.sort(list);

        System.out.println("Set: " + set);
        System.out.println("List:" + list);


    }
}
