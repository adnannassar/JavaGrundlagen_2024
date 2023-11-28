package Arrays.Aufgaben;

public class DurchschnittRechner {

    public static void main(String[] args) {
        int[] a = {4, 3, 6, 7, 10};
        System.out.println(durchschnitt(a));


    }

    public static float durchschnitt (int [] array){
        int summ = 0;
        for(int i =0 ; i<array.length ; i++){
            summ += array[i];
        }
        int erg = summ / array.length;
        return erg;
    }
}
