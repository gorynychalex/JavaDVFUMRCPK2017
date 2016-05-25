package ru.dvfu.mrcpk.ex07Arrays;

import java.io.IOException;
import java.util.Scanner;

public class Example07Array01 {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Введите значения элемента " + (i + 1) + "-го:");
            a[i] = scanner.nextInt();
        }
        //Сортировка пузырьком
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }

        //Вывод значений
        System.out.println("Отсортированный массив");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

//        bufferedReader.close();
    }
}