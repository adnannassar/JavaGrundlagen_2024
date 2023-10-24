package ControlStructure.IFs;

public class IF_Else {
    public static void main(String[] args) {
        int x = -10;
        // check if x positive or negative or zero
        if (x > 0) {
            System.out.println(x + " is positive");
        }
        else if(x == 0){
            System.out.println(x + " is zero");
        }
        else{
            System.out.println(x + " is negative");
        }
    }
}
