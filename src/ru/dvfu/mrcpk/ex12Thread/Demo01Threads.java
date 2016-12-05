package ru.dvfu.mrcpk.ex12Thread;

/**
 * Примеры создания потоков
 */
public class Demo01Threads {
    public static void main(String[] args) {

        //Создание объекта с потоком
        MyThread myThread = new MyThread();

        //Запуск потока
        myThread.start();

        System.out.println("Привет из основного потока");

    }
}

//Простейший класс-наследник потока
class MyThread extends Thread{

    @Override
    public void run() {

        //Вывод имени потока
        System.out.println(getName());
    }
}
