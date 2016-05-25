package ru.dvfu.mrcpk.ex11generics;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static volatile int k=0;
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
            System.out.println("k = " + k);

            new Thread(new MyRun()).start();
            System.out.println("k = " + k);

//              myThread.get(i).join();
//            new MyThread().start();
//            new Thread(new MyRun()).start();
//            new Thread(()-> System.out.println("Hello From Thread")).start();

        }
        System.out.println("End k = " + k);
    }
}

class MyThread extends Thread {
    public void run(){
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Hello From Thread" + i + " " + getName());
//        }
//        System.out.println("Hello From Thread" + " " + getName());
        Demo01.k = 1;
    }
}

class MyRun implements Runnable {

    @Override
    public void run() {
        Demo01.k = 2;
//            System.out.println("Hello From Thread" + Thread.currentThread().getName());
    }
}