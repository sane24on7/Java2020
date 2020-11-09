package java1.hw5;

//        * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//        * Конструктор класса должен заполнять эти поля при создании объекта;
//        * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;

public class Person {
    String name;
    String job;
    String email;
    String phone;
    int salary;
    int age;

    public Person(String name, String job, String email, String phone, int salary, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    public void getDataOfPerson(){
        System.out.println(this.name + ", " + this.job + ", " + this.email + ", " + this.phone + ", $" + this.salary
                + ", " + this.age + " y.o.");
    }

}
