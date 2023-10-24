package ControlStructure.Loops.DoWhile;

public class Do_While {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 10 using While");
        int i = 20;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }


        System.out.println("\nNumbers from 1 to 10 using Do-While");
        int x = 20;
        do{
            System.out.print(x + " ");
            x++;
        }while (x <= 10);
    }
}
