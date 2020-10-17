package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3_GuessNumber {

    public static void main(String[] args) {

//        Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается
//        3 попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли указанное
//        пользователем число, чем загаданное, или меньше. После победы или проигрыша выводится
//        запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        do {int count = 0;
            int guess = -1;
            int number = random.nextInt(10);
            while (count < 3 && guess != number) {
                System.out.print("Угадай число от 0 до 9: ");
                guess = sc.nextInt();
                if (number != guess) {
                    System.out.println("Указанное число " +
                            ((guess > number)? "больше загаданного" : "меньше загаданного"));
                    count++;
                }
            }
            System.out.println("Ты " +
                    ((guess == number)? "угадал!" : "проиграл : " + number));
            System.out.println("Повторить игру ещё раз? 1 - Да, 0 - Нет");
        } while (sc.nextInt() == 1);
    }
}