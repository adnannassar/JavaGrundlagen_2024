package ControlStructure.Loops.For;

public class For_Loop {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nNumbers from 10 to 1"); // 10, 1 , --
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nGerade Zahlen zwischen 1 und 10");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nUngerade Zahlen zwischen 1 und 10");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
