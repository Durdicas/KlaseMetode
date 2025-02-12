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


        // Zadatak 3: Unijeti u program broj ocjena po želji, ispisati prosjek ocjena.
        // (int brojGodina = Integer.parseInt(sc.nextLine());)

        // double sumica = 0;
        //int[]ocjene = {2,3,4,5,5,4,5,3,4};
        //for(int g:ocjene){
        // sumica+=(double)g;
        //  System.out.println(g);
        //}
        //double prosjek = sumica/ocjene.length;
        //System.out.println("Prosjek ocjena jest: " + prosjek);

    }
}