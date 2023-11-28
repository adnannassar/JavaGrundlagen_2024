package Algorithmen.Search;

public class Search {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1,2,3,4,5}, 1));
        System.out.println(linearSearch(new int[]{1,2,3,4,5}, 5));
    }

    public static boolean linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
