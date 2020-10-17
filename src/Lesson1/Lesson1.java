package Lesson1;

public class Lesson1 {

    public static void main(String[] args) {

        float res = calc(10, 20, 30, 40);
        System.out.println(res);

        boolean sum = task10and20(7, 8);
        System.out.println(sum);

        isPositiveOrNegative(-3);

        boolean a = isNegative(-10);
        System.out.println(a);

        String name = "Артём";
        prtMsg(name);

        year(2020);
    }

//    Создать переменные всех пройденных типов данных и инициализировать их значения.

//  byte b1 = 72;
//	short s1 = 12000;
//	int i1 = 150000;
//	long l1 = 7654321L;
//	float f1 = 9.99f;
//	double d1 = 7.15;
//	boolean bool = true;
//	char ch1 = 'a';
//	String str = "Hello!";

//    Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//    где a, b, c, d – аргументы этого метода, имеющие тип float.

    public static float calc(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

//    Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
//    от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    static boolean task10and20(int a, int b) {
        int sum = a + b;
        return sum > 10 && sum < 20;
    }

//    Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    static void isPositiveOrNegative(int a) {
        if (a >= 0) System.out.println("Число " + a + " положительное");
        else  System.out.println("Число " + a + " отрицательное");
    }

//    Написать метод, которому в качестве параметра передается целое число.
//    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    static boolean isNegative(int a) {
        if (a < 0) {return true;
        }
        return false;
    }

//    Написать метод, которому в качестве параметра передается строка, обозначающая имя.
//    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    static void prtMsg(String name) {
        System.out.println("Привет, " + name + "!");
    }

//    *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
//    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    static void year(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " г. не високосный");
        else  System.out.println(year + " г. високосный");
    }
}