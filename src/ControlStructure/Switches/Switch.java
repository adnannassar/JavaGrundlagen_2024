package ControlStructure.Switches;

public class Switch {
    public static void main(String[] args) {
        String monthName = "February";
        switch (monthName) {
            case "January":
                System.out.println("January has 31 Days");
                break;
            case "February":
                System.out.println("February has 28 Days");
                break;
            case "March":
                System.out.println("March has 31 Days");
                break;
            case "April":
                System.out.println("April has 30 Days");
                break;
            default:
                System.out.println("Invalid Month!");
        }

    }
}
