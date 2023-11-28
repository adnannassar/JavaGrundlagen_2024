package Arrays.Aufgaben;

public class MedianRechner {

    public static void main(String[] args) {
        float[] array1 = {1, 5, 4, 3, 8};
        float[] array2 = {1, 5, 4, 3, 2, 8};
        System.out.println(median(array1));
        System.out.println(median(array2));
    }

    public static float median(float[] array) {
        bubbleSort(array);
        int midIndex = array.length / 2;
        int beforeMidIndex = array.length / 2 - 1;

        if (array.length % 2 != 0) {
            return array[midIndex];
        } else {
            return (array[midIndex] + array[beforeMidIndex]) / 2;
        }
    }

    public static void bubbleSort(float[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void swap(float[] array, int a, int b) {
        float oldA = array[a];
        array[a] = array[b];
        array[b] = oldA;
    }
}
