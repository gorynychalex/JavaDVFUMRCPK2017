package ru.dvfu.mrcpk.ex07Arrays;

import ru.dvfu.mrcpk.ex02Classes.Person;

import java.util.ArrayList;

public class Example08ArrayList03 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Person vasya = new Person();
        vasya.setFirstname("Вася");
        vasya.setLastname("Пупкин");
        vasya.setAge(20);

        Person petya = new Person();
        petya.setFirstname("Петя");
        petya.setLastname("Кукушкин");
        petya.setAge(25);

        persons.add(vasya);
        persons.add(petya);

        System.out.println(persons.get(0).getFirstname());

    }
}
