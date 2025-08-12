package org.javacourse;

public class Magazin {

    public static void main(String[] args) {

        double pretInitial = 200.0;
        double procentReducere = 50.5; // 20%
        double pret = 10;

        // Apelam prima metoda pentru a calcula valoarea reducerii
        double valoareReducere = calculeazaValoareReducere(pretInitial, procentReducere);
        double ex2 = calculeazaValoareReducere(200, 10);

        // Calculam pretul final
        double pretFinal = pretInitial - valoareReducere;

        // Apelam o a doua metoda doar pentru a afisa rezultatul frumos
        afiseazaRezultat(pretInitial, pretFinal);

        System.out.println("************************");
        // Apelam de mai multe ori metota caculeazaValoareReducerePretFinalSiAfiseazaTot() pentru a observa diferenta de eficienta!!
        calculeazaValoareReducerePretFinalSiAfiseazaTot(100,10);
        calculeazaValoareReducerePretFinalSiAfiseazaTot(1025.89,40);
        calculeazaValoareReducerePretFinalSiAfiseazaTot(100,10);
    }

    private static double calculeazaValoareReducere(double pret, double procentReducere) {
    return pret * (procentReducere / 100);
    }

    /**
     * Calculeaza valoarea numerica a unei reduceri.
     *
     * @param pret    - Pretul initial al produsului.
     * @param procent - Procentul de reducere (ex: 20 pentru 20%).
     * @return Valoarea reducerii (ex: 30.0 pentru un pret de 150 si 20%).
     */
    public static void calculeazaValoareReducerePretFinalSiAfiseazaTot(double pret, double procent) {
        double valoareReducere = pret * (procent / 100);
        // Calculam pretul final
        double pretFinal = pret - valoareReducere;

        // Apelam o a doua metoda doar pentru a afisa rezultatul frumos
        afiseazaRezultat(pret, pretFinal);
    }

    /**
     * Afiseaza un mesaj formatat cu pretul initial si cel final.
     *
     * @param initial - Pretul original.
     * @param redus   - Pretul dupa aplicarea reducerii.
     */
    public static void afiseazaRezultat(double initial, double redus) {
        System.out.println("Produsul a fost redus!");
        System.out.printf("Pret initial: %.2f RON\n", initial);
        System.out.printf("Pret final: %.2f RON\n", redus);
        System.out.println("************------------------************");
    }

}
