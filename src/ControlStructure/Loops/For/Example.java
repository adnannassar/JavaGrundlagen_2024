package ControlStructure.Loops.For;

import java.sql.SQLOutput;

public class Example {
    public static void main(String[] args) {
        System.out.println("For: ");
        int n = 5;
        for (int i = n; i > 0; i -= 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nWhile: ");
        int i = 5;
        while (i > 0) {
            System.out.print(i + " ");
            i -= 2;
        }

        System.out.println("\n\nDo While: ");
        int x = 5;
        do {
            System.out.print(x + " ");
            x -= 2;
        } while (x > 0);

    }

}
