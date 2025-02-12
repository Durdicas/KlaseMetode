import java.util.Scanner;

public class DzSavrseniBroj {
    public static boolean jeSavrsenBroj (int broj) {

        // Zadatak 2: Napišite program koji ispisuje je li uneseni broj savršen ili ne.
        // Savršen broj je broj koji je jednak zbroju svojih djelitelja
        // (bez njega samoga). Npr. 6 (1 + 2 + 3 = 6)


        int sumaDjelitelja = 0;

        for (int i = 1; i<=broj / 2; i++) {
            if (broj % i == 0) {
                sumaDjelitelja += i;
            }
        }

        return sumaDjelitelja == broj;

            /*if (sumaDjelitelja == broj) {
                System.out.println(broj + " je savrsen broj.");
            } else {
                System.out.println(broj + " nije savrsen broj");
            }

            scan.close();*/
    }
}