package Classes;

public class Main {
    public static void main(String[] args) {
        // Definiere die Minuten
        int[] minutesArray = {5, 59, 60, 61, 825};

        for (int minutes : minutesArray) {
            // Berechne die Stunden und die verbleibenden Minuten
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            // Formatiere die Ausgabe im Format hmm
            String formattedOutput = hours + String.format("%02d", remainingMinutes);

            // Gebe das Ergebnis aus
            System.out.println("Anzahl Minuten: " + minutes + " --> Sollergebnis: " + formattedOutput);
        }
    }
}
