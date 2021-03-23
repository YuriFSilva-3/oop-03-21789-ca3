package com.oop;

import java.util.HashMap;
import java.util.List;

//HASHMAP CLASS
public class GenreHashMap {

    public static void main(String[] args) {

        java.util.HashMap<String, Integer> decadesResults = new java.util.HashMap<>();
        java.util.HashMap<String,List> decadesList = new java.util.HashMap<>(); //LIST


        decadesList.put("Glam Rock from the decades of: ", List.of(70,80,90));
        System.out.println(decadesList);

        decadesResults.put("Glam Rock from the ", 70);
        decadesResults.put("Punk Rock from the ", 80);
        decadesResults.put("Grunge from the ", 90);
        decadesResults.put("Rockabilly from the ", 60);
        System.out.println("Amount of the best decades " + decadesResults.size());
        System.out.println(decadesResults);


        if (decadesResults.containsKey("Glam Rock")) {
            Integer bandDecade = decadesResults.get("Glam Rock");
            System.out.println("Glam bands from the " + bandDecade);
        }

        decadesResults.put("Punk Rock", 90);
        System.out.println(decadesResults);
    }
}






