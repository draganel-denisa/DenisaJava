package org.javacourse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImpartireSigura {
    public static void main(String[] args) {
        // 'final' declara scanner-ul ca o constanta (referinta nu poate fi schimbata)
        final Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduceti deimpartitul: ");
            int deimpartit = scanner.nextInt();
            System.out.print("Introduceti impartitorul: ");
            int impartitor = scanner.nextInt();
            int rezultat = deimpartit / impartitor;
            System.out.println("Rezultatul este: " + rezultat);
        } catch (ArithmeticException | InputMismatchException e) {
            // Putem prinde mai multe exceptii intr-un singur bloc catch
            System.out.println("EROARE: Date de intrare invalide sau impartire la zero!");
        } finally {
            // Blocul 'finally' garanteaza ca scanner-ul se inchide
            System.out.println("Operatiunea s-a incheiat.");
            scanner.close();
        }
    }
    }
