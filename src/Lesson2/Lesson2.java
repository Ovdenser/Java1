package Lesson2;

public class Lesson2 {

    public static void main(String[] args) {

//        Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0.

        int[] mass01 = {1, 0, 1, 1, 0, 0, 0, 1, 1, 0};
        for (int i = 0; i < mass01.length; i++) {
            mass01[i] = mass01[i] == 1 ? 0 : 1;
            System.out.print(mass01[i] + " ");
        }
        System.out.print("\r\n\n");

//        Задать пустой целочисленный массив размером 8.
//        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.

        int[] mass8 = new int[8];
        for (int i = 1, j = 0; i < mass8.length; i++) mass8[i] = j += 3;
        for (int x : mass8) System.out.print(x + " ");
        System.out.print("\r\n\n");

//        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2.

        int[] mass6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass6.length; i++) {
            if (mass6[i] < 6) mass6[i] *= 2;
            System.out.print(mass6[i] + " ");
        }
        System.out.print("\r\n\n");

//        Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицам.

        int[][] massd1 = new int[9][9];
        for (int i = 0; i < massd1.length; i++) {
            for (int j = 0, j1 = massd1[i].length; j < massd1[i].length; j++, j1--) {
                if (i == j || i == (j1 - 1)) massd1[i][j] = 1;
                System.out.print(massd1[i][j] + " ");
            }
            System.out.print("\r\n");
        }
        System.out.print("\r\n");

//        ** Задать одномерный массив и найти в нем минимальный и максимальный элементы.

        int[] massminandmax = {9, 15, 7, 1, 3, 12, 0, 14, -2, 2, 6, 8, 4, 13, 5, -1, 10, 11};
        int max = massminandmax[0], min = massminandmax[0];
        for (int i = 0; i < massminandmax.length; i++) {
            if (massminandmax[i] > max) {
                max = massminandmax[i];
            }
            if (massminandmax[i] < min) {
                min = massminandmax[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}