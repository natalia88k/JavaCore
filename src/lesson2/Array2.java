package lesson2;

public class Array2 {
    public static void main(String[] args) {
        int[] fillArray = new int[8];

        for (int i = 0; i < fillArray.length; i++) {
            fillArray[i] = i * 3;
        }
        for (int datum: fillArray) {
            System.out.print(datum + " ");
        }
    }
}
