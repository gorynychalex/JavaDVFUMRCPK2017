package ru.dvfu.mrcpk.ex13io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo03Serial {
    public static void main(String[] args) throws Exception {
        CarSaveLoad carSaveLoad = new CarSaveLoad("Audi",10);
        carSaveLoad.setType("sedan");
        carSaveLoad.setColor("black");

        FileOutputStream fileOutputStream = new FileOutputStream("c:/test/carSaveLoad1.txt");

        carSaveLoad.save(fileOutputStream);

        fileOutputStream.close();



        FileInputStream fileInputStream = new FileInputStream("c:/test/carSaveLoad1.txt");

        CarSaveLoad carSaveLoad1 = new CarSaveLoad();
        carSaveLoad1.load(fileInputStream);

        System.out.println(carSaveLoad1.getName());
        System.out.println(carSaveLoad1.getAge());
        System.out.println(carSaveLoad1.getType());
        System.out.println(carSaveLoad1.getColor());

        fileInputStream.close();
    }

}
