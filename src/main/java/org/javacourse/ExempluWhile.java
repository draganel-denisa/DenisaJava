package org.javacourse;
public class ExempluWhile {
    public static void main(String[] args) {
        int numar1 = 1;

        while (numar1 <= 5) {
            System.out.println("Numarul curent este: " + numar1);
            numar1 = numar1 + 1;
//            numar1++;
        }

        System.out.println("\n*****************\n");
        int numar2 = 10;

        while (numar2 >= 1) {
            System.out.println("Numarul curent este: " + numar2);
            numar2 = numar2 - 1;

//            numar2--;
        }
    }

}