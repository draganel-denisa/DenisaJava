package org.javacourse;

import java.util.Scanner;
public class ExempluFor {
    public  static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        System.out.println("Alegeti numar inmultire....: ");
        int numarInmultire = cititor.nextInt();
        for (int i = 1; i <10; i++) {
            System.out.println(numarInmultire + " x " + i + " = "+ (numarInmultire * i));
        if (i>10) {
            System.out.println("Am intrat pe condita i>10!!!!");
            continue;
        }
            System.out.println("Am mai executat un task");
        }
    }
}
