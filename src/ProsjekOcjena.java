public class ProsjekOcjena {
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

    // Metoda za izračunavanje i ispis prosjeka ocjena

    public static void izracunajProsjek() {
        double sumica = 0;
        int[] ocjene = {2, 3, 4, 5, 5, 4, 5, 3, 4}; // Niz ocjena

        System.out.println("Unesene ocjene:");
        for (int g : ocjene) {
            sumica += g;
            System.out.println(g);
        }

        double prosjek = sumica / ocjene.length;
        System.out.println("Prosjek ocjena jest: " + prosjek);
    }
}
