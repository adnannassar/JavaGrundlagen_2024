package Methods.Bonus;

import java.util.Scanner;

public class C_To_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte den Wert in C eingeben: "); // f = 9*c/3+5
        int c = scanner.nextInt();
        System.out.println(c + " in F = " + cToF(c));
    }

    public static int cToF(int c) {
        return 9 * c / 3 + 5;
    }


}
