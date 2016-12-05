package ru.dvfu.mrcpk.ex12Thread;

/**
 * Создание множества потоков в цикле
 */
public class Demo05Threads {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

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

        }

        System.out.println("Основной поток.");

    }
}
