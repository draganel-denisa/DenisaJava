package org.javacourse;

public class Produs {
    private String nume;
    private double pret;
    private int cantitate;

    public Produs (String nume, double pret, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public  double getPret() {
        return pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setPret(double pret) {
        if (pret > 0) {
            this.pret = pret;
        } else {
            System.out.println("EROARE -- Pretul trebuie sa aiba numar pozitiv");
        }
    }

    public void setCantitate(int cantitate) {
        if (cantitate > 0) {
            this.cantitate = cantitate;
        } else {
            System.out.println("EROARE -- Cantitatea trebuie sa aiba numar pozitiv");
        }
    }
    public boolean esteDisponibil() {
        return cantitate > 0;
    }
}
