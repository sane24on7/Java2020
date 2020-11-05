package java1.hw5;

public class Homework5 {
    public static void main(String[] args) {
//      * Создать массив из 5 сотрудников

        Person[] persArray = new Person[5];

        persArray[0] = new Person(
                "Ivanov Ivan",
                "Engineer",
                "ivivan@mail.com",
                "89129126056",
                30000,
                50);
        persArray[1] = new Person(
                "Petrov Petr",
                "Programmer",
                "petropetr@mail.com",
                "89876543210",
                30000,
                48);
        persArray[2] = new Person(
                "Sergeev Sergey",
                "PR-manager",
                "sergoserg@mail.com",
                "89015678911",
                30000,
                25);
        persArray[3] = new Person(
                "Aleksandrov Aleksandr",
                "SMM",
                "alexalex@mail.com",
                "88005553535",
                30000,
                18);
        persArray[4] = new Person(
                "Vadimov Vadim",
                "Designer",
                "vladvlad@mail.com",
                "89991269074",
                30000,
                22);

//        * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

        for (int i = 0; i < persArray.length; i++) {
            Person person = persArray[i];
            if (person.age > 40) {
                person.getDataOfPerson();
            }
        }
    }

}
