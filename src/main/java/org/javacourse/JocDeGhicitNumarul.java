package org.javacourse;

import java.util.Scanner;

public class JocDeGhicitNumarul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numarSecret = (int) (Math.random() * 100) + 1;
        int incercare = 0;
        do {
            System.out.println("Genereaza un numar intre 1 si 100:");
            incercare = scanner.nextInt();
            if (incercare < numarSecret) {
                System.out.println("Prea mic!");
            } else if (incercare > numarSecret) {
                System.out.println("Prea mare!");
            } else {
                System.out.println("Felicitari, ai ghicit!");
            }
            } while (incercare != numarSecret); {
            }
        }
    }
