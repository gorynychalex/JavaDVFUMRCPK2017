package ru.dvfu.mrcpk.ex12Thread;

/**
 * Создание потоков с применением Lambda: (()-> lambdaBody)
 */
public class Demo06ThreadLambda {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            new Thread(()-> System.out.println("Hello from " + Thread.currentThread().getName())).start();

        }
    }
}
