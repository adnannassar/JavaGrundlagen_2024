package DataTypes.Numbers;

public class CommaNumbersClass {
    /*
   Data Type	Size	 Description
   float	    4 bytes	 Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
   double	    8 bytes	 Stores fractional numbers. Sufficient for storing 15 decimal digits
    */

    public static void main(String[] args) {
        float x = 100.5f;
        double y = 32000.2;
        System.out.println("float: " + x);
        System.out.println("double: " + y);
    }
}
