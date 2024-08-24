package org.example.frameworkCollection;


import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public  static void main(String[] args) {
  //les set sont des collections qui ne contiennent pas de doublons
        Set<String> cars = new TreeSet<>();
        //treeSet permet de trier les elements en ordre croissant ou alphabetique
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Renault");
        cars.add("Peugeot");

        //ajouter un autre set
        //addall permet d'ajouter un autre set
        Set<String> orthers = Set.of("Nissan", "Toyota", "Ford", "Chevrolet");
        cars.addAll(orthers);

        //eleminer les doublons
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5);
        Set<Integer> numbersSet = new TreeSet<>(numbers);
       /*  ou
         Set<Integer> numbersSet = new TreeSet<>();
         numbersSet.addAll(numbers); */
        //on affiche numbersSet
        for (int num : numbersSet) {
            System.out.println(num);
        }

        //afficher les elements du set
        for (String car : cars) {
            System.out.println(car);
        }
       }
}
