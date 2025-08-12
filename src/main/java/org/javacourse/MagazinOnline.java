package org.javacourse;

public class MagazinOnline {
    public static void main(String[] args) {
        Produs parfum = new Produs("Parfum", 450, 10);
        Produs pudra = new Produs("Pudra", 150, 15);
        Produs crema = new Produs("Crema de maini", 30, 55);

        System.out.println("Produsul: " + parfum.getNume() + ", Pret: " + parfum.getPret() + ", Cantitate: " + parfum.getCantitate());
        System.out.println("Produsul: " + pudra.getNume() + ", Pret: " + pudra.getPret() + ", Cantitate: " + pudra.getCantitate());
        System.out.println("Produsul: " + crema.getNume() + ", Pret: " + crema.getPret() + ", Cantitate: " + crema.getCantitate());

        System.out.println("***** Verificare disponibilitatii *****");

        System.out.println(parfum.getNume() + " disponibil? " + parfum.esteDisponibil());
        System.out.println(pudra.getNume() + " disponibil? " + pudra.esteDisponibil());
        System.out.println(crema.getNume() + " disponibil? " + crema.esteDisponibil());

        System.out.println();

        parfum.setPret(580);
        parfum.setCantitate(8);

        pudra.setPret(-100);
        pudra.setCantitate(3);

        crema.setPret(50);
        crema.setCantitate(-2);

        System.out.println();

        System.out.println("Produsul: " + parfum.getNume() + ", are noul pret de: " + parfum.getPret() + " RON, Cantitate noua: " + parfum.getCantitate());
        System.out.println("Produsul: " + pudra.getNume() + ", are noul pret de: " + pudra.getPret() + " RON, Cantitate noua: " + pudra.getCantitate());
        System.out.println("Produsul: " + crema.getNume() + ", are noul pret de: " + crema.getPret() + " RON, Cantitate noua: " + crema.getCantitate());
    }
}
