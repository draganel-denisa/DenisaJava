package org.javacourse;

public class SalutLume {
    // Metoda 'main' este ca ușa principală a unei case.
// Execuția programului începe întotdeauna de aici.
    public static void main(String[] args) {
// Această instrucțiune îi spune sistemului (System)
// să afișeze ceva pe ecranul de ieșire (out)
// și apoi să treacă la o linie nouă (println - print line).
        System.out.println("Hello, World!");
        String nume = "George";
        final int varsta = 32;

        System.out.println("Utilizatorul cu numele " + nume + " are varsta de: " + varsta + " ani.");
        System.out.println(10/3);
        System.out.println(10/(double)3);
        System.out.println(10 % 3);
        System.out.println(10 != 11);
        System.out.println(varsta < 18);
        System.out.println(10 == 10 && 11 == 11 && 0 > 1);
    }
}
