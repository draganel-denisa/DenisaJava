package org.javacourse;

public class AnalizaNotelor {
    public static void main(String[] args) {
        int[] note = {11, 13, 31, 24, 27, 98, 22};
        double media = calculeazaMedia(note);
        System.out.println("Media notelor este: " + media);
        int notaMaxima = gasesteNotaMaxima(note);
        System.out.println("Nota maxima este: " + notaMaxima);
        System.out.printf("Media notelor este: %.2f%n", media);
    }

        public static double calculeazaMedia(int[] note) {
            double suma = 0;
            for (int i = 0; i < note.length; i++) {
                suma = suma + note[i];
            }
                double media = suma / note.length;
            return media;
        }
    public static int gasesteNotaMaxima(int[] note) {
        int max = note[0];
        for (int i = 1; i < note.length; i++) {
            if (note[i] > max) {
                max = note[i];
            }
        }
        return max;
    }

}
