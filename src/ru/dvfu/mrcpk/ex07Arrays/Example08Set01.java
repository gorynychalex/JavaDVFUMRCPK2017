package ru.dvfu.mrcpk.ex07Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example08Set01 {
    public static void main(String[] args) {

        Set<String> family = new HashSet<String>();
        family.add("Пупкин");
        family.add("Сидоров");
        family.add("Иванов");
        family.add("Пупкин");
        family.add("Иванов");

        Iterator<String> f = family.iterator();

        while (f.hasNext())
            System.out.println(f.next());
    }
}
