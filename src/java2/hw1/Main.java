package java2.hw1;

import java2.hw1.course.Course;
import java2.hw1.course.RunningRoad;
import java2.hw1.course.SwimmingPool;
import java2.hw1.team.Team;
import java2.hw1.team.Teammate;

public class Main {
    /*
    1. Разобраться с имеющимся кодом (написанный во время урока)
    2. Создать класс Team, который будет содержать: название команды, массив из 4-х участников
    (т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации
    о членах команды прошедших дистанцию, метод вывода информации обо всех членах команды.
    3. Создать класс Course (полоса препятствий), в котором будут находиться: массив препятствий,
    метод который будет просить команду пройти всю полосу;
    То есть в итоге должно быть:

    public static void main(String[] args) {
    Course c = new Course(...); // Создаем полосу препятствий
    Team team = new Team(...); // Создаем команду
    c.doIt(team); // Просим команду пройти полосу
    team.showResults(); // Показываем результаты
    }
     */
    public static void main(String[] args) {
        Course[] courses = {new RunningRoad(), new SwimmingPool()};
        Team team = new Team("Blade Runners",
                new Teammate ("Andy", 155, 38),
                new Teammate("Lara", 350,70),
                new Teammate("Cody", 480,64),
                new Teammate("Carry", 150,0)
        );
        for (int i = 0; i < courses.length ; i++) {
            System.out.println();
            System.out.println("Course: " + courses[i].getClass().getName());
            courses[i].doIt(team);
            team.showFullResults();
            team.showSingleResults();

        }
    }
}
