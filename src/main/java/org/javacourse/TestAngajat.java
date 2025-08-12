package org.javacourse;

public class TestAngajat {
    public static void main(String[] args) {
        Manager manager = new Manager("Denisa", 3000, 3000);
        System.out.println("Managerul " + manager.getNume() + " are salariul " +
                manager.calculeazaSalariu() + "EUR. Dupa evaluare: " +
                manager.primesteEvaluare() + " acum primeste o promovare: " +
                manager.primestePromovare());

    }
}
