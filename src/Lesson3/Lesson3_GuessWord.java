package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3_GuessWord {

    public static void main(String[] args) {

//                * Создать массив из слов
//                String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
//                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
//                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
//                При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//                сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
//                Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//                apple – загаданное
//                apricot - ответ игрока
//                ap############# (15 символов, чтобы пользователь не мог узнать длину слова)

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String word;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        int n = random.nextInt(words.length);
        System.out.println(words[n]);
        System.out.println("Угадай слово");
        char[] ch = words[n].toCharArray();
        char[] chp = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            chp[i] = '#';
        }

        while (true) {
            System.out.print("Введи слово: ");
            word = scanner.nextLine();
            if (word.equals(words[n])) {
                System.out.println("Ты угадал");
                break;
            } else {
                System.out.println("Неверно");
                char[] chWord = word.toCharArray();

                for (int i = 0; i < ch.length; i++) {
                    if (i >= chWord.length) {
                        break;
                    }
                    if (ch[i] == chWord[i]) {
                        chp[i] = ch[i];
                    }
                }
                StringBuilder answ = new StringBuilder(String.valueOf(chp));
                for (int i = answ.length(); i < 15; i++) answ.append("#");
                System.out.println(answ);
            }
        }
    }
}