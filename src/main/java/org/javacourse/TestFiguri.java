package org.javacourse;

import java.io.FilterOutputStream;

public class TestFiguri {
    public static void main(String[] args) {
        FiguraGeometrica[] figuri = new FiguraGeometrica[3];
        try {
            figuri[0] = new Patrat(5);
            figuri[1] = new Cerc(3);
            figuri[2] = new TriunghiDreptunghic(12, 14);
//            System.out.printf("Suma de %.2f RON este echivalenta cu %.2f EUR.\n", sumaRON, sumaEUR);
            for (FiguraGeometrica figura : figuri) {
                if (figura instanceof Cerc) {
                    System.out.printf("\nAria cercului este: %.2f", figura.calculeazaAria());
                } else if (figura instanceof Patrat) {
                    System.out.printf("\nAria patratului este: %.2f", figura.calculeazaAria());
                } else {
                    System.out.printf("\nAria triunghiului este: %.2f", figura.calculeazaAria());
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tabloul are dimensiunea: " + figuri.length + " elemente. Alegeti un element din interior");
        }
    }
}

