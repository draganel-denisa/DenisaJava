package org.javacourse;

import java.util.Scanner;

public class VerificareParola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Va rugam introduceti parola ");
        String parolaIntrodusa = scanner.nextLine();
        String parolaCorecta = "java123";
        if (parolaIntrodusa.equals(parolaCorecta)) {
            System.out.println("Parola corecta. Autentificare reusita!");
        } else {
            System.out.println("Parola gresita. Acces respins!");
        }
        int numar1 = 12;
        int numar2 = 12;
        if(numar1 == numar2) {
            System.out.println("Numere egale");
        } else {
            System.out.println("Numerele nu sunt egale");
        }
    }
}

