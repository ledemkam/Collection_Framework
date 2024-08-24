package org.example.frameworkCollection;

import java.util.Arrays;

public class Basicd {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        tab[3] = 10;
        tab[4] = 20;
        tab[0] = 30;
        //trier le tableau
        Arrays.sort(tab);
        //position de l'élément 10
        int position = Arrays.binarySearch(tab, 10);
        System.out.println("Position de l'élément 10 : " + position);
       for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        //matrice
       int[][] matrice = new int[2][3];
         matrice[0][0] = 1;
    }
}
