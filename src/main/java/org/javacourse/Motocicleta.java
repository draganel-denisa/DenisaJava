package org.javacourse;

// Fisier nou: Motocicleta.java
public class Motocicleta extends Vehicul {
    public static int numarMoto = 0;

    public Motocicleta(String marca, int vitezaMaxima) {
        super(marca, vitezaMaxima);
        numarMoto++;
    }

    @Override
    public void claxoneaza() {
        System.out.println("Bip-bip! Motocicleta claxoneaza!");
    }

    public static int getNumarTotalMoto() {
        // Nu putem folosi 'this' sau 'marca' aici, pentru ca metoda nu apartine unui obiect anume.
        return numarMoto;

    }
}

