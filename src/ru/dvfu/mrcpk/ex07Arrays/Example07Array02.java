package ru.dvfu.mrcpk.ex07Arrays;

public class Example07Array02 {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(s);
        char[] a = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(a[i]);
            System.out.print(" = " + (int)a[i] +"\n");
        }



        System.out.println();
        for(char c:a){
            System.out.print(" " + c);
        }
        System.out.println();

    }
}
