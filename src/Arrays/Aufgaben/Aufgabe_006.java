package Arrays.Aufgaben;

public class Aufgabe_006 {
    public static void main(String[] args) {
        String[] namen = {"Mrs. Smith", "Mr. Lowe", "Mr. Mohamad Sami", "Mrs. Nuhaila"};
        System.out.print("Before: ");
        for (int i = 0; i < namen.length; i++) {
            System.out.print(namen[i] + " ");
        }
        System.out.print("\nAfter:  ");

        swap(namen, 1, 2);

        for (int i = 0; i < namen.length; i++) {
            System.out.print(namen[i] + " ");
        }
        System.out.println();
    }

    private static void swap(String[] array, int a, int b) {
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
