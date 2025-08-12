package org.javacourse;

    // Fisier: Vehicul.java
    public class Vehicul {
        private String marca;
        // 'protected' inseamna ca este 'private' pentru lumea exterioara,
        // dar 'public' pentru clasele copil.
        protected int vitezaMaxima;

        public Vehicul(String marca, int vitezaMaxima) {
            System.out.println("1. Constructor Vehicul este apelat...");
            this.marca = marca;
            this.vitezaMaxima = vitezaMaxima;
        }

        public String getMarca() {
            return marca;
        }

        public void claxoneaza() {
            System.out.println("Vehiculul claxoneaza!");
        }
    }

