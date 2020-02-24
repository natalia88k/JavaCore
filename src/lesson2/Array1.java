package lesson2;

public class Array1 {
    public static void main(String[] args) {
        int [] invertArray = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < invertArray.length; i++) {
            if (invertArray[i] % 2 != 0) {
                invertArray[i] = 0;
            } else {
                invertArray[i] = 1;
            }
        }
        for (int datum: invertArray) {
            System.out.print(datum);
        }
    }
}
