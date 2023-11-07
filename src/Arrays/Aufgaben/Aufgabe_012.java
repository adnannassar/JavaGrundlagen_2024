package Arrays.Aufgaben;

public class Aufgabe_012 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Before: ");
        print(array);
        System.out.println("After:  ");

        array = addNewElementToFullArray(array, 6);
        print(array);
    }


    public static int[] addNewElementToFullArray(int[] array, int value) {
        int[] erg = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            erg[i] = array[i];
        }

        erg[erg.length - 1] = value;
        return erg;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
