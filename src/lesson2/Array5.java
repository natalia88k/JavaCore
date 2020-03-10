package lesson2;

public class Array5 {
    public static void main(String[] args) {
        int min = -6;
        int max = 6;

        int[] foundMinMax = {1, 3, 5, -7, 8, 2};
        for (int i = 0; i < foundMinMax.length; i++) {
            if (foundMinMax[i] < min) {
                min = foundMinMax[i];
            }
            if (foundMinMax[i] > max) {
                max = foundMinMax[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
