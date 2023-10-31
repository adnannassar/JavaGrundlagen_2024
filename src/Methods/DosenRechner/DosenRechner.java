package Methods.DosenRechner;

import java.util.Scanner;

public class DosenRechner {
    private static double radius;
    private static double höhe;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dosen Rechner: ");
        System.out.print("Radius eingeben: ");
        radius = scanner.nextDouble();

        System.out.print("Höhe eingeben: ");
        höhe = scanner.nextDouble();

        System.out.println("Dosen Informationen:");
        System.out.println("umfang: " + umfang());
        System.out.println("deckelfläche: " + deckelfläche());
        System.out.println("mantelläche: " + mantelläche());
        System.out.println("oberläche: " + oberläche());
        System.out.println("volumen: " + volumen());
    }

    public static double umfang() {
        return Math.PI * radius;
    }

    public static double deckelfläche() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double mantelläche() {
        return umfang() * höhe;
    }

    public static double oberläche() {
        return (2 * deckelfläche()) + mantelläche();
    }

    public static double volumen() {
        return deckelfläche() * höhe;
    }


}
