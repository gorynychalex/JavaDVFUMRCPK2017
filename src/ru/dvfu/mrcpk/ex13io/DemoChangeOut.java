package ru.dvfu.mrcpk.ex13io;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Подмена потока вывода
 */
public class DemoChangeOut {
    public static void main(String[] args) {
        //Присвоение исходного PrintStream в специальную переменную
        PrintStream consoleStream = System.out;

        // динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        // адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //переопределение текущего System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        System.out.println("Что русскому хорошо, то немцу на месяц хватит");

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

        //Восстановление исходного состояния!!!
        System.setOut(consoleStream);

        //разворачиваем строку
        StringBuilder stringBuilder = new StringBuilder(result);
        stringBuilder.reverse();
        String reverseString = stringBuilder.toString();

        //вывод на консоль
        System.out.println(reverseString);
    }
}
