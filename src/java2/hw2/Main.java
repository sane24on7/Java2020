package java2.hw2;


public class Main {

    /*
    1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
    при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ
    или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией
    в какой именно ячейке лежат неверные данные.
    3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException
    и MyArrayDataException, и вывести результат расчета.
     */
        public static void main(String[] args) {
            try {
                String[][] values = {
                        {"0", "2", "7", "-3"},
                        {"O", "-1", "5", "4"},
                        {"3", "2", "6", "4"},
                        {"3", "2", "5", "-1"}
                };
                new ArraySum().calc(values);
            } catch (MyArraySizeException | MyArrayDataException e) {
                throw new RuntimeException("Something went wrong during calculation", e);
            }
        }
    }

