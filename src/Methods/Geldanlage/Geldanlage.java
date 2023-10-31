package Methods.Geldanlage;

import java.util.Scanner;

public class Geldanlage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Anlage Betrag eingeben: ");
        double anlageBetrag = scanner.nextDouble();


        System.out.print("Bitte Laufzeit eingeben: ");
        int laufzeit = scanner.nextInt();
        int auswahl ;
        do {
            System.out.println(
                    "--------------------------------------------------------------------\n" +
                            "1 1,5 % Verzinsung ohne Bonuszahlung\n" +
                            "2 0,7 % Verzinsung mit 15 Euro Bonuszahlung\n" +
                            "3 0,4 % Verzinsung mit 20 Euro Bonuszahlung\n" +
                            "4 0,1 % Verzinsung mit 50 Euro Bonuszahlung\n" +
                            "5 Fertig\n" +
                            "--------------------------------------------------------------------");

            System.out.print("Bitte auswählen: ");
            auswahl = scanner.nextInt();
            switch (auswahl) {
                case 1:
                    System.out.println(berechneKapital(1.5f, 0, anlageBetrag, laufzeit));
                    break;

                case 2:
                    System.out.println(berechneKapital(0.7f, 15, anlageBetrag, laufzeit));
                    break;

                case 3:
                    System.out.println(berechneKapital(0.4f, 20, anlageBetrag, laufzeit));
                    break;

                case 4:
                    System.out.println(berechneKapital(0.1f, 50, anlageBetrag, laufzeit));
                    break;

                case 5:
                    System.out.println("Danke bis zum nächsten Mal :)");
                    break;

                default:
                    System.out.println("Bitte etwas gültiges auswählen!");
            }
        } while (auswahl != 5);


    }


    public static double berechneKapital(float verzinsung, int bonus,
                                         double anlageBetrag, int laufZeit) {
        double summeDesKapitals = 0;
        for (int i = 1; i <= laufZeit; i++) {
            summeDesKapitals += anlageBetrag * (i + verzinsung / 100) + bonus;
        }
        return summeDesKapitals;
    }

}
