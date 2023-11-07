package Arrays.Aufgaben;

public class Aufgabe_001 {
    public static void main(String[] args) {

        // Aufgabe_001
        int[] array = new int[10];
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i * i;
        }
        // Aufgabe_002
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
