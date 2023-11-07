package Arrays.Aufgaben;

import java.util.Map;
import java.util.Random;

public class Aufgabe_004 {
    public static void main(String[] args) {
        // 4.0
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(1, 51);
            // array[i] = (int) ((Math.random() * 50) + 1);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // 4.1 & 4.2
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nMin: " + min);
        System.out.println("Max: " + max);
    }
}
