package org.javacourse;

import java.util.Arrays;

public class ArrayExemple {
    public static void main(String[] args) {
        int[] note = new int[5];
        note[0] = 10;
        note[1] = 8;
        note[4] = 10;
        // note[5] = 10;

        int lungimeNote = note.length;

        String[] zileLucratoare = {"Luni", "Marti", "Miercuri", "Joi", "Vineri"};

        int lungimeZileLucratoare = zileLucratoare.length;

        System.out.println(" Array-ul note[] are lungimea de: " + lungimeNote + " elemente, iar elementele sunt: " + Arrays.toString(note));
        System.out.println(" Array-ul zileLucratoare[] are lungimea de: " + lungimeZileLucratoare + " elemente, iar elementele sunt: " + Arrays.toString(zileLucratoare));

        String exempluText = "Denisa";
        System.out.println("exempluText este acum:" + exempluText);
        exempluText = "Serban";
        System.out.println("exempluText este acum:" + exempluText);
        exempluText = "Delia";
        System.out.println("exempluText este acum:" + exempluText);

        System.out.println("------************");

        String nume = "George";
        System.out.println("nume: " + nume);
        System.out.println(nume.toUpperCase());
        String numeModificat = String.join(", ", nume.toUpperCase(), nume.toUpperCase());
        System.out.println("numeModificat: " + numeModificat);
        System.out.println("nume: " + nume);

        System.out.println("******************Test imutabilitate int");
        int numar = 9;
        System.out.println("numar: " + numar);
        numar++;
        System.out.println("numar: " + numar);
        numar++;
        System.out.println("numar: " + numar);

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        String salut = "Buna";
        salut.toUpperCase(); // Aceasta linie creează un "BUNA" nou, dar nu îl salvează nicăieri.
        System.out.println(salut); // Va afișa "Buna", pentru că originalul este imutabil.

        // Varianta corectă:
        String salutModificat = salut.toUpperCase();
        System.out.println(salutModificat); // Va afișa "BUNA"

        String salutModificatLitereMici = salut.toLowerCase();
        System.out.println(salutModificatLitereMici);

        System.out.println("**************// exemplu practic String ");
        String email = "testemail";

// .contains(secventa) - verifică dacă textul conține o anumită secvență de caractere
        if (!email.contains("@")) {
            System.out.println("Eroare: Adresa de email nu contine '@'.");
        }

// .startsWith(prefix) / .endsWith(sufix) - verifică dacă textul începe/se termină cu ceva anume
        if (!email.endsWith(".ro")) {
            System.out.println("Eroare: Domeniul email-ului nu este valid.");
        }

// .trim() - elimină spațiile goale de la începutul și finalul textului
        String inputCuSpatii = "parola123@";
        System.out.println("inputCuSpatii: " + inputCuSpatii);
        String parolaCurata = inputCuSpatii.trim(); // "parola123"
        System.out.println("parolaCurata: " + parolaCurata);
        if(!(!parolaCurata.contains("@") && !parolaCurata.contains("%"))) {
            System.out.println("parola contine caractere nepermise (@ sau %)" );
        }
        if(parolaCurata.contains("@") || parolaCurata.contains("%")); {
            System.out.println("parola contine caractere nepermise (@ sau %)");
        }
    }
}
