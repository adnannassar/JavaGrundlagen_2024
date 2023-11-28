package Arrays.Aufgaben;

public class MergeAufgabe {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};

        print(merge(a, b));


    }

    public static int[] merge(int[] a, int[] b) {
        int[] array = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
        }

        for (int i = a.length, j = 0; i < array.length; i++, j++) {
            //array[5] = b[0]
            array[i] = b[j];
        }
        bubbleSort(array);
        return array;
    }


    //                        {1,2,3}   a = 0   , b = 1
    public static void swap(int[] array, int a, int b) {
        int oldA = array[a]; // oldA = 1, a = 0, b = 1, array[a] = 1
        array[a] = array[b]; // oldA = 1, a = 0, b = 1, array[a] = 2, array[b] = 2
        array[b] = oldA;     // oldA = 1, a = 0, b = 1, array[a] = 2, array[b] = 1
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


    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
