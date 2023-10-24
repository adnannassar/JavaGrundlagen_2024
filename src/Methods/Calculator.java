package Methods;

import java.util.Scanner;

public class Calculator {
    static int nr1;
    static int nr2;
    static char opr;
    public static void main(String[] args) {
        readInputs();
        calculationLogic();
    }

    static void calculationLogic(){
        switch (opr) {
            case '+':
                System.out.println(nr1 + " + " + nr2 + " = " + add(nr1, nr2));
                break;

            case '-':
                System.out.println(nr1 + " - " + nr2 + " = " + sub(nr1, nr2));
                break;

            case '*':
                System.out.println(nr1 + " * " + nr2 + " = " + mul(nr1, nr2));
                break;

            case '/':
                System.out.println(nr1 + " / " + nr2 + " = " + div(nr1, nr2));
                break;

            case '%':
                System.out.println(nr1 + " % " + nr2 + " = " + modulo(nr1, nr2));
                break;

            default:
                System.out.println("Please select one of the following  operations (+,-,*,/,%)");
        }
    }

    static void readInputs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Nr1: ");
        nr1 = scanner.nextInt();
        System.out.print("Enter Nr2: ");
        nr2 = scanner.nextInt();
        System.out.print("Select Operation (+,-,*,/,%): ");
        opr = scanner.next().charAt(0);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        if (b == 0) {
            System.out.print("Devide by Zero!!! --> ");
            return -1;
        } else {
            return a / b;
        }
    }

    static int modulo(int a, int b) {
        return a % b;
    }
}
