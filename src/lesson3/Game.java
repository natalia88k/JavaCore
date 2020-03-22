package lesson3;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        int number = (int)(Math.random() * 9);
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 9");
        int answer = scanner.nextInt();

        while (counter < 3) {
            if (answer == number) {
                System.out.println("Вы угадали!");
                break;
            }
            if (answer > number) {
                System.out.println("Загаданное число меньше");
                break;
            }
            if (answer < number) {
                System.out.println("Загаданное число больше");
                break;
            }
            counter++;
        }

        System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
        int yesNo = scanner.nextInt();
        switch (yesNo) {
            case 1:
                System.out.println("Давай продолжим!");
                break;
            case 0:
                System.out.println("Пока");
                break;
        }

        scanner.close();
    }
}
