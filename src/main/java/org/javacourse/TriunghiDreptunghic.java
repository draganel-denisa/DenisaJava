package org.javacourse;

public class TriunghiDreptunghic extends FiguraGeometrica {
    private double baza;
    private double inaltime;

    public TriunghiDreptunghic(double baza, double inaltime) {
        this.baza = baza;
        this.inaltime = inaltime;
    }

    @Override
    public double calculeazaAria() {
        return (baza * inaltime) / 2;
    }


}
