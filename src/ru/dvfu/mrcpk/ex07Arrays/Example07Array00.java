package ru.dvfu.mrcpk.ex07Arrays;

public class Example07Array00 {
    public static void main(String[] args) {
        int[] a = new int[255];
        for (int i = 0; i < 255; i++) {
            a[i]=i;
        }
        System.out.println();
        for(int i : a){
            System.out.print(" \'");
            System.out.print(Character.toChars(i));
            System.out.print("\' = " + i);
        }
        System.out.println();
        System.out.println("\u0041");
    }
}
