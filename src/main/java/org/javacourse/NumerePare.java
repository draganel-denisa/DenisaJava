package org.javacourse;

import java.util.Scanner;

public class NumerePare {
    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        System.out.println("Introdu un numar intreg N");
        int n = cititor.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
