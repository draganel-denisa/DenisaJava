package org.javacourse;

import java.util.Scanner;

    public class ExempluDoWhile {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int optiune;
            do {
                System.out.println("\n--- Meniu ---");
                System.out.println("1. Afiseaza mesaj");
                System.out.println("0. Iesire");
                System.out.print("Alege o optiune: ");
                optiune = scanner.nextInt();
                if (optiune == 1) {
                    System.out.println("Salut, lume!");
                }
            } while (optiune != 0);
            System.out.println("Program incheiat.");
        }
    }

