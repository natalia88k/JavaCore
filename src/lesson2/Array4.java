package lesson2;

public class Array4 {
    public static void main(String[] args) {
        int[][] fillDiagonal = new int[5][5];

        for (int i = 0; i < fillDiagonal.length; i++) {
            for (int j = 0; j < fillDiagonal.length; j++) {
                fillDiagonal[i][i] = 1;
            }
        }
        for (int i = 0; i < fillDiagonal.length; i++) {
            for (int j = 0; j < fillDiagonal.length; j++) {
                System.out.print(fillDiagonal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
