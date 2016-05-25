package ru.dvfu.mrcpk.ex03geometry;

public class Example03 {

    public static void main(String[] args) throws Exception{
        int a = -10, b = 20;
        Прямоугольник rect1 = new Прямоугольник(a, b);
        Прямоугольник rect2 = new Прямоугольник(a, b);
        Thread.currentThread().getStackTrace();
//        swap(a,b);
//        Rectangle.swapSides(rect1);
//        rect1.swapSides(rect2);

//        boolean c = (a == b);
//        System.out.println(c);
//
//        if(c){
//            System.out.println("Фигура является квадратом");
//        }
//        else if(a < b)
//        {
//            System.out.println("Фигура - прямоугольник горизонтальный");
//        }
//        else if( a > b){
//            System.out.println("Фигура - прямоугольник вертикальный");
//        } else {
//            System.out.println("Фигура непонятная");
//        }
//
        if(rect1.equals(rect2)){
            System.out.println("Объекты равны");
        } else {
            System.out.println("Объекты неравны");
        }
    }

    public static void swap(int a, int b){
        int tmp=a;
        a=b;
        b=tmp;
    }




    //Метод расчета площади прямоугольника
    public static int square(int aa, int bb){
        return aa * bb;
    }

    public static int perimetr(int aa, int bb){
        return 2*(aa+bb);
    }



}
