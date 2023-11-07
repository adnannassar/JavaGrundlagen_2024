package Arrays.Aufgaben;

public class Aufgabe_007 {
    public static void main(String[] args) {
        String[] namen = {"Mrs. Smith", "Mr. Lowe",
                "Mohamad Sami", "Nuhaila"};
        for (int i = 0; i < namen.length; i++) {
            if (namen[i].startsWith("Mrs.")) {
                namen[i] = namen[i].substring( 5);
            }
            if (namen[i].startsWith("Mr.")) {
                namen[i] = namen[i].substring(4);
            }
        }
        for (int i = 0; i < namen.length; i++) {
            System.out.print(namen[i] + "\t");
        }
    }
}
