package Arrays.Aufgaben;

public class Aufgabe_013 {
    public static void main(String[] args) {
        int[] array = new int[10];
    }


    public static double durchschnitt(int[] array) {
        double summe = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
            if (array[i] != 0) {
                counter++;
            }
        }
        return summe / counter;
    }
}
