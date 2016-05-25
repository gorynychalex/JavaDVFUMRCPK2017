package ru.dvfu.mrcpk.ex07Arrays;

public class Example07Array03 {
    public static void main(String[] args) {

        String[] s = {"Hello world", "Class Room", "My Name"};

        for(String s1 : s){
            for(char c : s1.toCharArray()){
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }
}
