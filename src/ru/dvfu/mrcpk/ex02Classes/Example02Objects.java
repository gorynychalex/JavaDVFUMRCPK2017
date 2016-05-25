package ru.dvfu.mrcpk.ex02Classes;

public class Example02Objects {


    public static void main(String[] args) {

        Person person1 = new Person("Вася", "Пупкин", 18, true, 180, "Это мой человек! - ", true);
        Person person2 = new Person("Коля", "Игнатьев");
        Person person3 = new Person("Борис", "Сидоров", 20);
        Person person4 = new Person();

        for (int i = 0; i < 3; i++) {
            Person.number=i++;
            System.out.println("Статическая переменная number = " + Person.number);
        }



        Car car1 = new Car();
        car1.setName("Merc");
        car1.setType("sedan");

        person1.setCar(car1);

        person1.getCar().getName();

        person1.setLastname("Пупков");

        person1.aboutObject();

    }
}
