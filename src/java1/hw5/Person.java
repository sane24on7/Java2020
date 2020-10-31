package java1.hw5;

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
        System.out.println(this.name + ", " + this.job + ", " + this.email + ", " + this.phone + ", $" + this.salary + ", " + this.age + " y.o.");
    }

}
