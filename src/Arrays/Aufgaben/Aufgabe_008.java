package Arrays.Aufgaben;

public class Aufgabe_008 {
    public static void main(String[] args) {
        int[] array = {4, 3, 30, 10, 20};
        System.out.println("Is array gerade ? --> " + checkArrayGerade(array));
    }

    public static boolean checkArrayGerade(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
