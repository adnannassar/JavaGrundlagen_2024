package Methods;

import java.time.LocalDateTime;

public class Methods {

    public static void main(String[] args) {
        addProzedur(10, 20);

        int discount = 10;
        int y = addFunction(10, 20);
        System.out.println(y - discount);
    }

    static void addProzedur(int x, int y) {
        int result = x + y;
        System.out.println(result);
    }

    static int addFunction(int x, int y) {
        int result = x + y; // 30
        return result;
    }


    static void showActualTime() {
        System.out.println(LocalDateTime.now());
    }


}
