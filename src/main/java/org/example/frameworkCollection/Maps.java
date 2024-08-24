package org.example.frameworkCollection;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        //les maps sont des collections qui contiennent des paires cle/valeur

        Map<String, Integer> courses = new HashMap<>();
        courses.put("Math", 15);
        courses.put("English", 12);
        courses.put("French", 10);
        courses.put("History", 8);
        courses.put("Geography", 6);

        //afficher uniquement les cles
        for(String key : courses.keySet()){
            System.out.println(key);
        }

        //afficher uniquement les valeurs
        for(int value : courses.values()){
            System.out.println(value);
        }

        //afficher tous les elements de la map
        for (Map.Entry<String, Integer> course : courses.entrySet()) {
            System.out.println(course.getKey() + " : " + course.getValue());
        }
    }
}
