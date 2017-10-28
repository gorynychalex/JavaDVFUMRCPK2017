package ru.dvfu.mrcpk.ex01Begin;

//Задача нахождения младшего разряда в числе

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x%10);
    }
}
