package java2.hw3;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        /*
    1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
    из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
    2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот
    телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона
    по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда
    при запросе такой фамилии должны выводиться все телефоны.
    Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять
    еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
    Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().
 */
        doTask1();
        doTask2();

    }

    static void doTask1() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato", "orange", "mushroom", "olive", "pea"};

        Set<String> unique = new HashSet<>(Arrays.asList(words));
        System.out.println(unique);

        Map<String,Integer> counter = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (counter.containsKey(words[i])) {
                counter.put(words[i], counter.get(words[i]) + 1);
            } else {
                counter.put(words[i], 1);
            }
        }

        System.out.println(counter);
    }

    static void doTask2(){
        PhoneBook book = new PhoneBook();
        System.out.println("Phone number quantity: " + book.get("Maks").size());
    }
}
