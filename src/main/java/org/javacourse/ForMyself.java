package org.javacourse;

import java.util.Scanner;

public class ForMyself {
    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        System.out.println("Cate numere vrei sa introduci?");
        int cate = cititor.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= cate; i++)  {
            System.out.println("Introdu numarul" + i + ":");
            int numar = cititor.nextInt();
            if (numar > max) {
                max = cate;
            }
        }
        System.out.println("Cel mai mic numar introdus a fost: " + max);
    }
}
