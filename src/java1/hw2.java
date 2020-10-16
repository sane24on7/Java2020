package java1;

import java.util.Arrays;

public class hw2 {
    public static void main(String[] args) {
//        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arrayTask1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Task 1");
        System.out.println(Arrays.toString(arrayTask1));
        invertArray(arrayTask1);
        System.out.println(Arrays.toString(arrayTask1));


//        2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arrayTask2 = new int[8];
        System.out.println("Task 2");
        fillArray(arrayTask2);
        System.out.println(Arrays.toString(arrayTask2));


//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
        int[] arrayTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Task 3");
        System.out.println(Arrays.toString(arrayTask3));
        changeArray(arrayTask3);
        System.out.println(Arrays.toString(arrayTask3));


//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
//        цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] arrayTask4 = new int[7][7];
        System.out.println("Task 4");
        fillDiagonalArray(arrayTask4);


//        5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int [] arrayTask5 = new int[20];
        System.out.println("Task 5");
        findMinAndMax(arrayTask5);


//        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть
//        true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//        Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
//        граница показана символами ||, эти символы в массив не входят.

    }

    //        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //        С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = 1 - inputArray[i];
        }
    }
    //        2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void fillArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = i * 3;
        }
    }
    //        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
    public static void changeArray(int[] inputArray) {
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] < 6){
                inputArray[i] = inputArray[i] * 2;
            }
        }
    }
//    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
//    цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fillDiagonalArray(int[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i][i] = 1; // Заполнение первой диагонали
            inputArray[i][inputArray[i].length-1-i] = 1; // Заполнение второй диагонали
            System.out.println(Arrays.toString(inputArray[i]));
        }
    }
//    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void findMinAndMax(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int) (Math.random() * 1000);
        }
        int max = 0;
        int min = 1000;
        for (int i:
             inputArray) {
            if (i > max ) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println(Arrays.toString(inputArray));
        System.out.println("Minimum = " + min + ", maximum = " + max);
    }
}
