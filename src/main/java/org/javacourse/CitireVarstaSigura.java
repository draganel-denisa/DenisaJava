package org.javacourse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CitireVarstaSigura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int varsta = 0;
        boolean inputValid = false;

        do {
            try {
                System.out.print("Va rugam introduceti varsta dumneavoastra: ");
                varsta = scanner.nextInt();

                if (varsta < 0) {
                    // Aruncam manual o exceptie daca varsta este negativa
                    throw new IllegalArgumentException("Varsta nu poate fi negativa.");
                }
// 0 = 0; 1 = 1; 2 = 10; 3 = 11; 4 = 100
                int x = 6;  // binary 0110
                int y = 3;  // binary 0011
                //int z = x & y; ninary 2 0010
                if (varsta >= 0 && varsta < 18) {
                    throw new IllegalArgumentException("Persoana trebuie sa fie majora pentru a putea vota.");
                }
                inputValid = true; // Daca am ajuns aici, totul e ok

            } catch (InputMismatchException e) {
                System.out.println("EROARE: Trebuie sa introduceti un numar intreg. Incercati din nou.");
                scanner.next(); // Curatam buffer-ul scanner-ului de input-ul gresit
            } catch (IllegalArgumentException e) {
                System.out.println("EROARE: " + e.getMessage() + " Incercati din nou.");
            }
        } while (!inputValid);

        System.out.println("Multumim! Ati introdus varsta: " + varsta);
        scanner.close();
    }
}
