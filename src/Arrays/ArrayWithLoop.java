package Arrays;

import java.util.Random;

public class ArrayWithLoop {
    public static void main(String[] args) {
        // Values sind klar!
        //       index:  0      1   2   3
        int[] array   = {-100, 320, 7, 10};

        // read from Array!
        System.out.println("Read from Array");
        printArray(array);

        // write in Array!
        fillArrayWithRandomValues(array, 1, 100);

        System.out.println("\nRead from Array after edit!");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + " in Array has the Value: " + array[i]);
        }
    }

    public static void fillArrayWithRandomValues(int[] array, int from, int to) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(from, to);
        }
    }
}
