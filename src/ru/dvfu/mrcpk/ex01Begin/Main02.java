package ru.dvfu.mrcpk.ex01Begin;

import java.util.Locale;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        in.useLocale(Locale.US);
        in.useLocale(Locale.ENGLISH);

        double x = in.nextDouble();

        double y = in.nextDouble();

        System.out.format(Locale.US,
                "Переменные: x = %.2f, y = %.1f", x, y);
    }
}
