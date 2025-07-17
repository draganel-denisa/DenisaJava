package org.javacourse;
import java.util.Scanner;
public class ConvertorValutar {
    public static void main(String[] args) {
        // Definim cursul ca o CONSTANTA.
        // 'final' inseamna ca valoarea nu mai poate fi schimbata.
        // Conventia este sa scriem numele constantelor cu majuscule.
        final double CURS_RON_EUR = 4.98;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti suma in RON: ");
        double sumaRON = scanner.nextDouble();

        // Calculul conversiei
        double sumaEUR = sumaRON / CURS_RON_EUR;

        // Afisare formatata pentru un aspect profesional
        // 'printf' ne permite sa formatam textul. '%.2f' inseamna "un numar double cu fix 2 zecimale".
        // '\n' la final adauga o linie noua, la fel ca println.
        System.out.printf("Suma de %.2f RON este echivalenta cu %.2f EUR.\n", sumaRON, sumaEUR);

        scanner.close();
    }
}

