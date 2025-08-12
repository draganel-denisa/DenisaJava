package org.javacourse;

public class Masina {
    // 1. Atribute (Câmpuri / Fields) - Ce "are" o mașină?
    // Acestea sunt variabilele care definesc starea unui obiect.
    private String marca;
    private String culoare;
    private int vitezaCurenta;
    private int anFabricatie;

    // 2. Metode / Actiuni / Comportamente - Ce "face" o mașină?
    // Acestea sunt acțiunile pe care le poate executa un obiect.

    public Masina(String marca, String culoare, int anFabricatie) {
        this.marca = marca;
        this.culoare= culoare;
        this.vitezaCurenta = 0;
        this.anFabricatie = anFabricatie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }
//    public void setAnFabricatie(int anFabricatie) {
//        this.anFabricatie = anFabricatie;
//
//    }
//
//
//    public void accelereaza(int cuCat) {
//        vitezaCurenta = vitezaCurenta + cuCat;
//        System.out.println(marca + " accelereaza. Viteza noua: " + vitezaCurenta + " km/h");
//    }

    public void franeaza() {
        vitezaCurenta = 0;
        System.out.println(marca + " s-a oprit.");
    }
    // Setter cu VALIDARE
    public void setAnFabricatie(int anNou) {
        if (anNou > 1900 && anNou <= 2025) { // Permitem doar ani rezonabili
            this.anFabricatie = anNou;
        } else {
            System.out.println("Eroare: Anul " + anNou + " nu este un an valid.");
        }
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public int getVitezaCurenta() {
        return vitezaCurenta;
    }

    public void setVitezaCurenta(int vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    // Metoda de comportament care foloseste atributele private
    public void accelereaza(int cuCat) {
        if (cuCat > 0) {
            this.vitezaCurenta += cuCat;
        }
    }


    public void afiseazaDetalii() {
        System.out.println("Detalii masina: " + marca + ", Culoare: " + culoare + ", An: " + anFabricatie);
    }
}
