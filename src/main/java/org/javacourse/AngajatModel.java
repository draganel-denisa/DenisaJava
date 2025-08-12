package org.javacourse;

public abstract class AngajatModel {
    private String nume;

    public AngajatModel(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract double calculeazaBonusAngajatModel();
}
