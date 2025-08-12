package org.javacourse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImpartireNesigura {
    public static void main(String[] args) {
        // 'final' declara scanner-ul ca o constanta (referinta nu poate fi schimbata)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti deimpartitul: ");
        int deimpartit = scanner.nextInt();
        System.out.print("Introduceti impartitorul: ");
        int impartitor = scanner.nextInt();
        int rezultat = deimpartit / impartitor;
        System.out.println("Rezultatul este: " + rezultat);

        scanner.close();
    }
}

