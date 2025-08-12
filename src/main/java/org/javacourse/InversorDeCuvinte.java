package org.javacourse;

public class InversorDeCuvinte {
    public static void main(String[] args) {
        String cuvantAles = "Denisa";
        String cuvantInversat = inverseazaCuvant(cuvantAles);
        System.out.println("Cuvantul inversat este: " + cuvantInversat);
    }
    public static String inverseazaCuvant(String cuvant) {
        String inversat = "";
        for(int i = cuvant.length() - 1; i >= 0; i--) {
            inversat += cuvant.charAt(i);
        }
        return inversat;
    }
}
