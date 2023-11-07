package Arrays.Aufgaben;

public class Aufgabe_009 {
    public static void main(String[] args) {
        String[] words = {"Äpfel", "Banana", "orangen", "Kiwi", "Red", "Ahmad", "emad", "Israa"};
        System.out.println("Anzahl Vokalen Normal  : " + anzahlVokalen(words));
        System.out.println("Anzahl Vokalen Klausur : " + anzahlVokalenForKlausur(words));
    }

    public static int anzahlVokalen(String[] words) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (
                    words[i].toLowerCase().startsWith("a") ||
                            words[i].toLowerCase().startsWith("o") ||
                            words[i].toLowerCase().startsWith("e") ||
                            words[i].toLowerCase().startsWith("i") ||
                            words[i].toLowerCase().startsWith("u") ||
                            words[i].toLowerCase().startsWith("ä") ||
                            words[i].toLowerCase().startsWith("ü") ||
                            words[i].toLowerCase().startsWith("ö")
            ) {
                counter++;
            }
        }
        return counter;
    }

    public static int anzahlVokalenForKlausur(String[] words) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            char letter = words[i].charAt(0);
            if (
                    letter == 'o' || letter == 'O' ||
                            letter == 'a' || letter == 'A' ||
                            letter == 'e' || letter == 'E' ||
                            letter == 'u' || letter == 'U' ||
                            letter == 'i' || letter == 'I' ||
                            letter == 'ä' || letter == 'Ä' ||
                            letter == 'ü' || letter == 'Ü' ||
                            letter == 'ö' || letter == 'Ö'

            ) {
                counter++;
            }
        }
        return counter;
    }
}
