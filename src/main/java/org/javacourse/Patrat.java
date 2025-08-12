package org.javacourse;

public class Patrat extends FiguraGeometrica {
    private double latura;

    public Patrat(double latura) {
        this.latura = latura;
    }

    @Override
    public double calculeazaAria() {
        return latura * latura;
    }
}
