package cz.itnetwork;

import java.util.Scanner;
import java.util.Arrays;


public class Zelenina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "Windows-1250");
        String[] zelenina = {"zelí", "okurka", "rajče", "paprika", "ředkev", "mrkev", "brokolice"};
        String[] ovoce = {"jablko", "hruška", "pomeranč", "jahoda", "banán", "kiwi", "malina"};
        int pocetSlov = 0;
        String volba = "ano";

        while (volba.equals("ano")) {
            System.out.println("Zadej název libovolného ovoce nebo zeleniny: ");
            String slovo = scanner.nextLine().trim().toLowerCase();

            boolean nalezenoOvoce = false;
            boolean nalezenaZelenina = false;

            for (String o : ovoce) {
                if (slovo.equals(o)) {
                    System.out.println("Zadal jsi ovoce");
                    nalezenoOvoce = true;
                }
            }
            if (!nalezenoOvoce) {
                for (String z : zelenina) {
                    if (slovo.equals(z)) {
                        System.out.println("Zadal jsi zeleninu");
                        nalezenaZelenina = true;
                    }
                }
            }

            if (!nalezenoOvoce && !nalezenaZelenina) {
                System.out.println("Tvoje slovo nemám v seznamu");
            }

            pocetSlov++;
            System.out.println("Přeješ si zadat další slovo? (ano/ne)");
            volba = scanner.nextLine().trim().toLowerCase();
        }

        System.out.printf("Zadal jsi %d slov", pocetSlov);





    }
}

