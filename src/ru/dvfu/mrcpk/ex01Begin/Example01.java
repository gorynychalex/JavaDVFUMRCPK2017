package ru.dvfu.mrcpk.ex01Begin;

import java.io.IOException;
import java.io.InputStream;

public class Example01 {

    public static void main(String[] args) throws IOException {

//        Rectangle rectangle = new Rectangle(3.5F, 5.5F);
//
//        System.out.println("Площадь прямоугольника = " + rectangle.square());

        //Объявление переменных, присвоили значение и задали формулы

        int a=0, b, s, p;

        InputStream inputStream = System.in;
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println(inputStream);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите значение стороны 'a' прямоугольника:");
//        try {
//            if (sc.hasNextInt())
//                a = sc.nextInt();
//            else if(sc.hasNextFloat())
//                a = (int)sc.nextFloat();
//            else if(sc.hasNextDouble())
//                a = (int) sc.nextDouble();
//            else
//                System.out.println("Повторяю, необходимо ввести число!");
//        } catch (Exception e){
//            System.out.println("ЧИСЛО!");
//        }
//



//        a = Integer.parseInt(bufferedReader.readLine());

//        System.out.println("Введите значение стороны 'b' прямоугольника:");
//        b = sc.nextInt();
//        b = Integer.parseInt(bufferedReader.readLine());

//        s = square(a, b);
//
//        p = perimetr(a, b);
//
//        System.out.println("Площадь прямоугольника со сторонами a = " + a + ", b = " + b + ", равна: " + s);
//
//        System.out.println("Периметр прямоугольника со сторонами a = " + a + ", b = " + b + ", равна: " + p);

//        bufferedReader.close();
    }

    //Метод расчета площади прямоугольника
    public static int square(int aa, int bb){
        return aa * bb;
    }

    public static int perimetr(int aa, int bb){
        return 2*(aa+bb);
    }



}
