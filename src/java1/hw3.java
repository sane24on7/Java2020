package java1;

import java.util.Random;
import java.util.Scanner;

public class hw3 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
//        1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать
//        это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
//        или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»
//        (1 – повторить, 0 – нет).
        System.out.println("Ваша задача угадать число");
        do {
            int number = random.nextInt(10);
            int count = 0;
            int inputNumber = -1;
            while ( count < 3 && inputNumber != number ) {
                System.out.println("Загадано число от 0 до 9, у вас 3 попытки. Введите число:");
                inputNumber = scanner.nextInt();
                if (number != inputNumber) {
                    System.out.println("Ваше число " +
                            ((inputNumber > number)? "слишком большое" : "слишком маленькое"));
                    count++;
                }
            }
            System.out.println("Вы " + ((inputNumber == number)? "выиграли!" : "проиграли." + number));
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        } while(scanner.nextInt() == 1);
    }
    // Проверка входных данных
    static int getNumberFromConsole() {
        do {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Введите целое число");
            scanner.nextLine();
        } while (true);
    }

    static void guessNumber() {
        
    }
}
