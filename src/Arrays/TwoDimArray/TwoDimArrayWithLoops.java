package Arrays.TwoDimArray;

public class TwoDimArrayWithLoops {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        fillTwoDimArray(array);
        printTwoDimArray(array);


    }

    public static void printTwoDimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillTwoDimArray(int[][] array) {
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] =  counter++;
            }
        }
    }
}
