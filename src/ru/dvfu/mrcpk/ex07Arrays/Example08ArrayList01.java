package ru.dvfu.mrcpk.ex07Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Example08ArrayList01 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(1,100);
        arrayList.add(2,200);

        if(arrayList.isEmpty()) {
            System.out.println("Массив пустой, выводить нечего");
        }
        else {
            for (int i = 0; i < arrayList.size(); i++) {
                Integer newInt=arrayList.get(i);
                arrayList.set(i, newInt+5);
                System.out.println(arrayList.get(i));
            }

        }

        System.out.println("Отсортированный список Set:");
        TreeSet<Integer> treeSet=new TreeSet<Integer>();
        for(Integer i : arrayList){
            treeSet.add(i);
        }
        for(Integer i : treeSet){
            System.out.println(i);
        }


        Collections.sort(arrayList);

    }
}
