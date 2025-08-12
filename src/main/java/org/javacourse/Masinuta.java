package org.javacourse;

    public class Masinuta extends Vehicul {
        private int numarUsi;

        // Atribut STATIC - partajat de toate obiectele Masina
        private static int numarMasiniCreate = 0;
        public Masinuta(String marca, int vitezaMaxima, int numarUsi) {
            // 'super()' APELEAZA CONSTRUCTORUL DIN CLASA PARINTE.
            // Este un apel OBLIGATORIU si trebuie sa fie PRIMA linie!
            super(marca, vitezaMaxima);
            System.out.println("2. Constructor Masina este apelat...");
            this.numarUsi = numarUsi;

            numarMasiniCreate++;
        }
        public int getNumarUsi() {
            return numarUsi;
         }
         @Override
        public void claxoneaza() {
            System.out.println("Tiit-tiiit! Masina claxoneaza!");
        }
        // Metoda STATICA - poate fi apelata direct pe clasa
        public static int getNumarTotalMasini() {
            // Nu putem folosi 'this' sau 'marca' aici, pentru ca metoda nu apartine unui obiect anume.
            return numarMasiniCreate;
        }


    }
