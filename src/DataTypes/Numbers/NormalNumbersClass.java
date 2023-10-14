package DataTypes.Numbers;

public class NormalNumbersClass {
    /*
   Data Type	Size	Description
   byte	        1 byte	Stores whole numbers from -128 to 127
   short	    2 bytes	Stores whole numbers from -32,768 to 32,767
   int	        4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
   long	        8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    */

    public static void main(String[] args) {
        byte x = 100;
        short y = 32000;
        int z = 2147483;
        long w = 1231231231;
        System.out.println("byte: " + x);
        System.out.println("short: " + y);
        System.out.println("int: " + z);
        System.out.println("long: " + w);
    }
}
