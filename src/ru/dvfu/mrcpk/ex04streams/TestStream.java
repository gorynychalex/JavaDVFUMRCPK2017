package ru.dvfu.mrcpk.ex04streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by user on 13.04.2016.
 */
public class TestStream {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        InputStreamReader a = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(a);

        while (true)
            System.out.println(br.readLine());
    }
}
