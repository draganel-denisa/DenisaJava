package org.javacourse;
// Fisier: Garaj.java
public class Garaj {
    public static void main(String[] args) {

        // Cream primul obiect (prima instanta) a clasei Masina
        // 'new Masina()' este actul de a construi casa pe baza planului.
        Masina logan = new Masina("Dacia", "Alb", 2020);
        String marca = logan.getMarca();


        // Setam starea (atributele) pentru acest obiect specific
     // logan.marca = "Dacia";
      //  logan.culoare = "Alb";
       logan.setAnFabricatie(2021);
       logan.setAnFabricatie(2025);
        System.out.println("Vopsim masina " + marca + " ....");     String vecheaCuloare = logan.getCuloare();
        logan.setCuloare("roz");
        String nouaCuloare = logan.getCuloare();
        System.out.println("Vechea culoare era: " + ". Noua culoare este: " + nouaCuloare + ".");

        // Cream al doilea obiect, complet independent de primul
        Masina bmw = new Masina("BMW","Negru", 2022);
       // bmw.marca = "BMW";
      //  bmw.culoare = "Negru";
       // bmw.anFabricatie = 2022;

        // Cream al treilea obiect
        Masina lambourghini = new Masina("lambourghini", "rosu", 2025);
     //   lambourghini.marca = "lambourghini";
    //    lambourghini.culoare = "Rosu";
      //  lambourghini.anFabricatie = 2025;

        Masina[] garajulMeu = {lambourghini, logan, bmw};

        // Apelam metodele pentru fiecare obiect
        logan.afiseazaDetalii(); // Afiseaza detaliile Logan-ului
        bmw.afiseazaDetalii();   // Afiseaza detaliile bmw-ului
        Masina lambourghini1 = garajulMeu[0];
        lambourghini.afiseazaDetalii();

        System.out.println("\n--- Incepe actiunea! ---");
        logan.accelereaza(50); // Doar Logan-ul accelereaza
        bmw.accelereaza(80);   // BMW-ul accelereaza independent
        lambourghini.accelereaza(200);
        garajulMeu[0].accelereaza(100);
        int vitezaCurentaLambo = garajulMeu[0].getVitezaCurenta();
        int vitezaLambo = vitezaCurentaLambo;
        System.out.println("vitezaFinala Lamborghini: " + vitezaLambo);
    }
}



