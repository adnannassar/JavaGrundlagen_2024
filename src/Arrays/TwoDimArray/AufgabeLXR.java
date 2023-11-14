package Arrays.TwoDimArray;

public class AufgabeLXR {
    public static void main(String[] args) {
        char[][] array = new char[7][7];
        fillTwoDimArrayBC(array);
        printTwoDimArray(array);
    }

    public static void fillTwoDimArrayLXR(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j < array.length / 2) {
                    array[i][j] = 'L';
                } else if (j == array.length / 2) {
                    array[i][j] = 'X';
                } else if (j > array.length / 2) {
                    array[i][j] = 'R';
                } else {
                    array[i][j] = '#';
                }
            }
        }
    }

    public static void fillTwoDimArrayY(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    array[i][j] = 'Y';
                } else if (i % 2 != 0 && j % 2 != 0) {
                    array[i][j] = 'Y';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

    }

    public static void fillTwoDimArrayBC(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= array.length / 2 && j <= array.length / 2 && i + j == array.length / 2) {
                    array[i][j] = 'B';
                } else if (i >= array.length / 2 && j >= array.length / 2 && i + j == (array.length + array.length / 2) - 1) {
                    array[i][j] = 'F';
                } else if ((i > 0 && i < array.length / 2) && (j > array.length / 2 && j < array.length - 1) && (j - i == array.length / 2)) {
                    array[i][j] = 'S';
                } else if ((i > array.length / 2 && i < array.length - 1) && (j > 0 && j < array.length/2) && (i - j == array.length / 2)) {
                    array[i][j] = 'M';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

    }

    public static void printTwoDimArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
