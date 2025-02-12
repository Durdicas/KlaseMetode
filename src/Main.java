import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Domaća Zadaća
        // Uzeti bilo koja 2 zadatka iz prethodne zadaće i preoblikovati rješenje da se koriste metode.
        // Dakle, preraditi zadatak tako da se metoda jedne klase poziva u drugoj klasi.
        Scanner scan = new Scanner(System.in);

        System.out.print("Unesi broj: ");
        int broj = scan.nextInt();

        if (DzSavrseniBroj.jeSavrsenBroj(broj)) {
            System.out.println(broj + " je savršen broj.");
        } else {
            System.out.println(broj + " nije savršen broj.");
        }

        scan.close();

        // Domaća zadaća
        //System.out.print("Unesi broj: " + DzSavrseniBroj.class);

        // Pozivanje metode za izračun prosjeka ocjena
        ProsjekOcjena.izracunajProsjek();
    }
}

