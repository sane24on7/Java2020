package java1;

public class hw1 {
    public static void main(String[] args) {
        /*
        1 Создать пустой проект в IntelliJ IDEA и прописать метод main().

        2 Создать переменные всех пройденных типов данных и инициализировать их значения.
         */

        byte varByte = -120;
        short varShort = 10000;
        int varInt = -50000;
        long varLong = 1000L;
        float varFloat = 1.23f;
        double varDouble = -123.123;
        char varChar = 'v';
        boolean varBool = false;
        // 3 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //    где a, b, c, d – аргументы этого метода, имеющие тип float.

        System.out.println(calc(1.2f, 2.2f, 1.1f, 0.2f));

        // 4 Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
        //    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

        System.out.println(isWithin(6, 1));

        // 5 Написать метод, которому в качестве параметра передается целое число, метод должен
        //    напечатать в консоль, положительное ли число передали или отрицательное.
        //    Замечание: ноль считаем положительным числом.

        isPositive(-9);

        // 6 Написать метод, которому в качестве параметра передается целое число. Метод должен
        //    вернуть true, если число отрицательное, и вернуть false если положительное.

        System.out.println(isNegative(-9));

        // 7 Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        //    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

        greetings("Илья");

        // 8 *Написать метод, который определяет, является ли год високосным, и выводит сообщение
        //    в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом
        //    каждый 400-й – високосный.

        year(500);
    }

    // 3

    public static float calc(float a, float b, float c, float d) {
        return  a * (b + (c / d));
    }

    // 4
    public static boolean isWithin(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    // 5
    public static void isPositive(int a) {
        System.out.println( a < 0 ? "Число " + a + " отрицательное!" : "Число " + a + " положительное!");
    }

    // 6
    public static boolean isNegative(int a) {
        return  a < 0;
    }

    // 7
    public static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // 8
    public static void year(int y) {
        int four = y % 4;
        int hundred = y % 100;
        int fourHundred = y % 400;
        if((four == 0 && hundred != 0) || fourHundred == 0) System.out.println("Год високосный!");
        else System.out.println("Год не високосный");
    }
}
