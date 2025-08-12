package org.javacourse;

public class TestMasinuta {
    public static void main(String[] args) {
        Masinuta masinutaPorsche9116tRS = new Masinuta("Porche", 340, 2);
        Masinuta masinutaVolkswagenFox = new Masinuta("VW", 210, 2);

        System.out.println("VW Fox are viteza maxima : " + masinutaVolkswagenFox.vitezaMaxima + "Km/h");
        System.out.println("Porsche 911 6t3 are viteza maxima: " + masinutaPorsche9116tRS.vitezaMaxima + "Km/h");

        System.out.println("VW Fox are: " + masinutaVolkswagenFox.getNumarUsi() + " usi.");
        System.out.println("Porsche 911 6t3: " + masinutaPorsche9116tRS.getNumarUsi() + " usi.");

        masinutaVolkswagenFox.claxoneaza();
        masinutaPorsche9116tRS.claxoneaza();

        Vehicul vechicul = new Masinuta("Dacia", 150, 4);
        //  vechicul.claxoneaza();
        //  vechicul.getMarca();
        Vehicul v = new Vehicul("Trabant", 100);
        v.claxoneaza();

        Vehicul vehicul2 = new Motocicleta("Yamaha", 200);
        vehicul2.claxoneaza();

        Masinuta.getNumarTotalMasini(); // Apel pe clasa, nu pe obiect
        System.out.println("Total masini: " + Masinuta.getNumarTotalMasini());

        Motocicleta.getNumarTotalMoto();
        System.out.println("Total motociclete: " + Motocicleta.getNumarTotalMoto());

        // vechicul.getNumarUsi();
        // pentru ca am definit obiectul vehicul de tipul Vehicul chia daca avem o instanta de Masinuta();
        // putem folosi doar metodele definite in clasa Vehicul: claxoneaza(), getMarca();
    }
}
