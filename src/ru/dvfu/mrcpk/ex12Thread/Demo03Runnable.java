package ru.dvfu.mrcpk.ex12Thread;

/**
 * Пример создания потока через класс, имплементирующий интерфейс Runnable
 */
public class Demo03Runnable {

    public static void main(String[] args) {

        //Создание объекта содержащего метод для создания потока
        MyRunnable myRunnable = new MyRunnable();

        //Создание объекта у которого есть метод запуска потока
        Thread thread = new Thread(myRunnable);

        //Запуск потока
        thread.start();

        System.out.println("Привет из основного потока");

    }
}

//Класс-наследник интерфейса Runnable (в котором единственный метод run())
class MyRunnable implements Runnable{

    @Override
    public void run() {
        Thread.currentThread().setName("НОВЫЙ ПОТОК");

        System.out.println(Thread.currentThread().getName());
    }
}