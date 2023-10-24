package Operators;

public class Operators {
    // 1. + - * / % =
    // 2. ++ --
    // 3. += -= *= /= %=
    // 4. > >= < <= == !=
    // 5. && ||
    public static void main(String[] args) {
        // 1.
        int x = 20;
        int y = 8;
        System.out.println("1. + - * / % =");
        System.out.println("Result of x + y = " + (x + y));
        System.out.println("Result of x - y = " + (x - y));
        System.out.println("Result of x * y = " + (x * y));
        System.out.println("Result of x / y = " + (x / y));
        System.out.println("Result of x % y = " + (x % y));


        // 2. ++ --
        System.out.println("\n2. ++ --");
        int z = 10;
        System.out.println("z: " + z);
        System.out.println("z: " + z++);
        System.out.println("z: " + ++z);


        // 3. += -= *= /= %=
        System.out.println("\n3. += -= *= /= %=");
        int a = 20;
        System.out.println("a: " + a);
        a += 2;
        System.out.println("a: " + a);
        a %= 10;
        System.out.println("a: " + a);

        // 4. > >= < <= == !=
        System.out.println("\n4. > >= < <= == !=");
        int b = 30;
        int c = 20;
        boolean result = b > c;
        System.out.println("result of b > c " + result);

        // 5. && ||
        System.out.println("\n 5. && ||");
        boolean result2 = (b > 0) && (b > 10) && (b != 30);
        System.out.println("result of (b > 0) && (b > 10) && (b == 30) " + result2);

        boolean result3 = (b > 0) || (b > 10) || (b != 30);
        System.out.println("result of (b > 0) || (b > 10) || (b == 30) " + result3);
    }
}
