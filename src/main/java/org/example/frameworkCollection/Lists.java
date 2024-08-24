package org.example.frameworkCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
       //les collections sont des objets qui contiennent d'autres objets


        //Listes: une collection ordonnée d'éléments

        List<String> fruits = List.of("pomme", "banane", "orange");

        List<String> fruits2 = new ArrayList<>();

        //ajouter des elements dans la liste
        fruits2.add("orange");
        fruits2.add("guaive");
        fruits2.add("cherimoya");
        fruits2.add("pomme");

        //supprimer un element dans la liste
        fruits2.remove("pomme");

        //tri de la liste
        Collections.sort(fruits2);

        //verifier si un element existe dans la liste
        if (fruits2.contains("orangei")) {
            System.out.println("orange existe dans la liste");
        } else {
            System.out.println("orangei n'existe pas dans la liste");
        }
        //mettre pineaple a la place de guaive
        fruits2.set(fruits2.indexOf("guaive"), "pineaple");


        //premiere facon afficher la liste
          /*for(int i = 0; i < fruits2.size(); i++){
            System.out.println(fruits2.get(i));
        } */

        //deuxieme facon afficher la liste avec foreach
        for (String fruit : fruits2) {
            System.out.println(fruit);
        }

        //troisieme facon afficher la liste avec interator

        /* while (fruits2.iterator().hasNext()) {
            System.out.println(fruits2.iterator().next());
        } */

    }
}
