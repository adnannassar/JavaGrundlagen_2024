package ControlStructure.Loops.While;

public class While_Loop {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 10");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\nGerade Zahlen zwischen 1 und 10");
        int x = 1;
        while (x <= 10) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
            x++;
        }

        System.out.println("\nGerade Zahlen zwischen 1 und 10");
        int z = 1;
        while (z <= 10) {
            if (z % 2 != 0) {
                System.out.print(z + " ");
            }
            z++;
        }
    }
}
