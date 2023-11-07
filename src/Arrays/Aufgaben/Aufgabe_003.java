package Arrays.Aufgaben;

public class Aufgabe_003 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i * i;
        }
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }
        System.out.println("Summe = " + summe);

        System.out.println("Durchschnitt = " + summe / array.length);



    }
}
