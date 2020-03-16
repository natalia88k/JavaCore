package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicToc {
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static char[][] map;

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра окончена");
    }

    public static boolean checkWin(char symb) {
        return checkWinColumn(symb) || checkWinRow(symb) || checkWinUpDiagonal(symb) || checkWinLowDiagonal(symb);
    }

    public static boolean checkWinColumn(char symb) {

        for (int j = 0; j < SIZE; j++) {
            boolean result = true;
            for (int i = 0; i < SIZE; i++) {
                if (map[i][j] != symb) {
                    result = false;
                }
            }
            if (result == true) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkWinRow(char symb) {

        for (int i = 0; i < SIZE; i++) {
            boolean result = true;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] != symb) {
                    result = false;
                }
            }
            if (result == true) {
                return true;
            }
        }
        return  false;
    }

    public static boolean checkWinUpDiagonal(char symb) {

        boolean result = true;
        for (int i = 0, j = 0; i < SIZE && j < SIZE; i++, j++) {
            if (map[i][j] != symb) {
                result = false;
            }
        }
        if (result == true) {
            return true;
        }
        return false;
    }
    
    public static boolean checkWinLowDiagonal(char symb) {

        boolean result = true;
        for (int i = SIZE - 1, j = 0; i >= 0 && j < SIZE; i--, j++) {
            if (map[i][j] != symb) {
                result = false;
            }
        }
        if (result == true) {
            return true;
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
