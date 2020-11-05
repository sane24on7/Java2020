package java1.hw6;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(200, 2);
        Dog dog = new Dog(500, 10, 0.5f);

        System.out.println("Cat");
        cat.run(200);
        cat.run(250);
        cat.swim(100);
        cat.jump(1);
        cat.jump(3);

        System.out.println("Dog");
        dog.run(450);
        dog.run(550);
        dog.swim(9);
        dog.swim(100);
        dog.jump(0.9f);
        dog.jump(0.1f);


    }
}
