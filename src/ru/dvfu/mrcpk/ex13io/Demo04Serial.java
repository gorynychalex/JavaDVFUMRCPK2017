package ru.dvfu.mrcpk.ex13io;

import java.io.*;
import java.util.Objects;

public class Demo04Serial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CarSerial car = new CarSerial("BMW", 10);
        car.setColor("white");
        car.setType("crossover");

        FileOutputStream fileOutputStream = new FileOutputStream("c:/test/carserial.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(car);

        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("c:/test/carserial.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CarSerial car1 = new CarSerial();

        Object object = objectInputStream.readObject();

        if(object instanceof CarSerial)
            car1 = (CarSerial) object;
        else
            throw new IllegalArgumentException("Тип объекта не соответствует");

        System.out.println(car1.getName());
        System.out.println(car1.getColor());
        System.out.println(car1.getType());
        System.out.println(car1.getAge());

        objectInputStream.close();
        fileInputStream.close();
    }
}
