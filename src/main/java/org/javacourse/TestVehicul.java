package org.javacourse;

public class TestVehicul {
    public static void main(String[] args) {
        Vehicul[] vehicule = new Vehicul[3];
        vehicule[0] = new Masinuta("Dacia", 180, 4);
        vehicule[1] = new Motocicleta("Honda", 220);
        vehicule[2] = new Masinuta("BMW", 250, 2);

        for (Vehicul v : vehicule) {
            System.out.print(v.getMarca() + " face: ");
            v.claxoneaza(); // Polimorfism in actiune

            // Verificam tipul real si apelam o metoda specifica copilului
            if (v instanceof Masinuta) {
                // Pentru a apela getNumarUsi(), trebuie sa facem "cast"
                // Ii spunem compilatorului: "Stiu sigur ca acest Vehicul este de fapt o Masina"
                Masinuta masinaCurenta = (Masinuta ) v;
                System.out.println("  -> Este o masina cu " + masinaCurenta.getNumarUsi() + " usi.");
            }
        }

    }
}
