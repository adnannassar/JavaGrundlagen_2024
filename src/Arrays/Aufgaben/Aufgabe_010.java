package Arrays.Aufgaben;

public class Aufgabe_010 {
    public static void main(String[] args) {
        String[] words = {"Äpfel", "Banana", "orangen", "Kiwi", "Red", "Ahmad", "emad", "Israa"};
        System.out.print("Check word: (Orangen) --> ");

        if (searchWord(words, "Orangen")) {
            System.out.println("gefunden!");
        } else {
            System.out.println("Nicht gefunden!");
        }
    }


    public static boolean searchWord(String[] array, String word) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(word)) {

                return true;
            }
        }
        return false;
    }

}
