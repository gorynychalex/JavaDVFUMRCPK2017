package ru.dvfu.mrcpk.ex13io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileReader & FileWriter - адаптеры между File и интерфейсами InputStream, OutputStream, Reader, Writer
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("c:/test/file1.txt");
        FileWriter fileWriter = new FileWriter("c:/test/file2.txt");

        while (fileReader.ready()){
            int data = fileReader.read();
            fileWriter.write(data);
        }

        fileReader.close();
        fileWriter.close();
    }
}
