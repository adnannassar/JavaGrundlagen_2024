package ControlStructure.Switches;

public class Months {

    public static void main(String[] args) {

        // Das ist nur ein Beispiel, Fehler bei der Angaben !!
        String monthName = "April";

        switch (monthName){
            case    "Januar",
                    "März",
                    "Mai",
                    "Juli",
                    "August":
                System.out.println(31);
            break;

            case "Otober":
                System.out.println(20);
                break;
            case "Dezember":
                System.out.println(15);
                break;
        }
    }
}
