package ru.dvfu.mrcpk.ex12Thread;

/**
 * Создание потоков с использованием анонимных классов
 */
public class Demo04Threads {
    public static void main(String[] args) {

        /** Создание объекта анонимного класса Thread,
         *  в котором параметром передается объект анонимного класса Runnable,
         *  который сразу запускается
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Поток: " + Thread.currentThread().getName());
            }
        }).start();



        System.out.println("Основной поток.");

    }
}
