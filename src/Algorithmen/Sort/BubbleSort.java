package Algorithmen.Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 0, 7, 3};
        System.out.print("Before: ");
        print(array);

        bubbleSort(array);
        System.out.print("\nAfter:  ");
        print(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] array, int a, int b) {
        int oldA = array[a];
        array[a] = array[b];
        array[b] = oldA;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
