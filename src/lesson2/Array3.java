package lesson2;

public class Array3 {
    public static void main(String[] args) {
        int[] changeArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < changeArray.length; i++) {
            if ( changeArray[i] < 6) {
                changeArray[i] *= 2;
            }
        }
        for (int datum: changeArray) {
            System.out.print(datum + " ");
        }
    }
}
