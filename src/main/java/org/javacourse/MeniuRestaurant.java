package org.javacourse;


import java.util.Scanner;

public class MeniuRestaurant {
    public static void main(String[] arges) {
        Scanner cititor = new Scanner(System.in);
        System.out.println("Plasati comanda: Optiuni valide: 1, 2 sau 3" +
                "\n1 - Ciorba de burta, 2 - Sarmale sau 3 - Papanasi" +
                "\nSeletia trebuie sa fie un numar intreg! --->");
        // single-line comment
        /* comment pe mai
        multe
        randuri
         */
        int optiuneMeniu = cititor.nextInt();
        switch (optiuneMeniu) {
            case 1:
                System.out.println("Ati ales ciorba de burta");
                break;
            case 2:
                System.out.println("Ati ales sarmale cu mamaliguta.");
                break;
            case 3:
                System.out.println("Ati ales papanasi.");
                break;
            default:
                System.out.println("Optiune invalida. Va rugam alegeti 1, 2 sau 3.");
        }
    }
}
