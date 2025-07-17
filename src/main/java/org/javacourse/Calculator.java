package org.javacourse;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        double nr1 = cititor.nextDouble();
        System.out.print("Introduceti al doilea numar: ");
        double nr2 = cititor.nextDouble();
        System.out.print("Introduceti operatorul (+, -, *, /): ");
        char operator = cititor.next().charAt(0);
//        String operator = cititor.nextLine();
        double rezultat = 0.0;
        boolean operatieValida = true; // Presupunem initial ca operatia este valida

        // Vom folosi o structura if-else if pentru a gestiona logica
        if (operator == '+') {
            rezultat = nr1 + nr2;
        } else if (operator == '-') {
            rezultat = nr1 - nr2;
        } else if (operator == '*') {
            rezultat = nr1 * nr2;
        } else if (operator == '/') {
            // Validarea datelor de intrare: verificam impartirea la zero
            if (nr2 != 0) {
                rezultat = nr1 / nr2;
            } else {
                System.out.println("Eroare: Impartirea la zero nu este permisa!");
                operatieValida = false; // Marcam ca operatia nu a fost valida
            }
        } else {
            System.out.println("Eroare: Operator invalid!");
            operatieValida = false; // Marcam ca operatia nu a fost valida
        }
        // Afisam rezultatul doar daca operatia a fost valida
        if (operatieValida) {
            System.out.println("Rezultatul calculului: " + nr1 + " " + operator + " " + nr2 + " = " + rezultat);
        }
        cititor.close();
    }

}
