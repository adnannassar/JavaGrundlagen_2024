package Arrays.TwoDimArray;

public class Main {
    public static void main(String[] args) {
        // Define
        int[][] array2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] array1 = new int[3][3];

        // Size
        System.out.println("Size: " + array1[2].length);


        // Write
        array2[2][1] = -1;

        // Read
        System.out.print(array2[0][0] + " ");
        System.out.print(array2[0][1] + " ");
        System.out.print(array2[0][2] + " ");
        System.out.println();
        System.out.print(array2[1][0] + " ");
        System.out.print(array2[1][1] + " ");
        System.out.print(array2[1][2] + " ");
        System.out.println();
        System.out.print(array2[2][0] + " ");
        System.out.print(array2[2][1] + " ");
        System.out.print(array2[2][2] + " ");




    }
}
