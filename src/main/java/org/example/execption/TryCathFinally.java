package org.example.execption;

import java.util.Scanner;

public class TryCathFinally {

    public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number: ");
            try {//try est un bloc de code qui permet de tester un bloc de code pour les erreurs
                int number = scanner.nextInt();
                double result = 100 / number;
                //System.out.println("The number is: " + number);
            } catch (Exception e) {//catch est un bloc de code qui permet de gérer les erreurs
                System.out.println(e);

            }finally {
                //finally est un bloc de code qui permet d'exécuter du code, après un bloc try...catch,
                // qu'il y ait une exception ou non
                System.out.println("Finally block is always executed");
            }

        }
    }
}
