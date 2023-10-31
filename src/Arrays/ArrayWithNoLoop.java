package Arrays;

public class ArrayWithNoLoop {
    public static void main(String[] args) {
        // Values sind klar!
        //       index:  0     1   2
        int[] array1 = {-100, 320, 7};
        // read from Array!
        System.out.println("Read from Array1");
        System.out.println("Index 0 in Array1 has the Value: " + array1[0]);
        System.out.println("Index 1 in Array1 has the Value: " + array1[1]);
        System.out.println("Index 2 in Array1 has the Value: " + array1[2]);

        // write in Array!
        array1[0] = 100;
        array1[1] = -320;
        array1[2] = -7;
        System.out.println("Read from Array1 after edit!");
        System.out.println("Index 0 in Array1 has the Value: " + array1[0]);
        System.out.println("Index 1 in Array1 has the Value: " + array1[1]);
        System.out.println("Index 2 in Array1 has the Value: " + array1[2]);


        // Values sind nicht klar!
        int[] array2   = new int[3]; // {0, 0, 0}

        // read from Array2
        System.out.println("\nRead from Array2");
        System.out.println("Index 0 in Array2 has the Value: " + array2[0]);
        System.out.println("Index 1 in Array2 has the Value: " + array2[1]);
        System.out.println("Index 2 in Array2 has the Value: " + array2[2]);

        // write in Array!
        array2[0] = 5;
        array2[1] = 3;
        array2[2] = 10;
        System.out.println("Read from Array2 after edit!");
        System.out.println("Index 0 in Array2 has the Value: " + array2[0]);
        System.out.println("Index 1 in Array2 has the Value: " + array2[1]);
        System.out.println("Index 2 in Array2 has the Value: " + array2[2]);





    }
}
