package ru.dvfu.mrcpk.ex01Begin;

//Задача нахождения младшего разряда в числе

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x = ");

        //Переменная в которую сохраняется введенное значение
        int x = scanner.nextInt();

        //Объявление переменной, вычисление результата и присвоение знач. y
        int y = x%10;

        //Вывод результата
        System.out.println("\nМладший разряд в числе x=" + x + " - " + String.valueOf(x%10));
    }
}
