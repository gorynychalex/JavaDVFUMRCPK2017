package ru.dvfu.mrcpk.ex01Begin;

//Задача нахождения младшего разряда в числе

import java.util.Scanner;

public class Main00 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x = ");

        //Переменная в которую сохраняется введенное значение
        int x = scanner.nextInt();

        System.out.print("Введите значение y = ");

        //Переменная в которую сохраняется введенное значение
        int y = scanner.nextInt();


        //Вывод результата
        System.out.println("\nx=" + x + ", y = " + y);

        System.out.println("Сумма чисел: " + (x+y));
    }
}
