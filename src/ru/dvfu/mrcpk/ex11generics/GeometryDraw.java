package ru.dvfu.mrcpk.ex11generics;

import ru.dvfu.mrcpk.ex10inheritance.Triangle;

public class GeometryDraw {
    public static void main(String[] args) {

//        Rectangle rectangle = new Rectangle();

        Rectangle rectangle = new Rectangle(10.5,10.5,100.5,100.5);
        if(rectangle instanceof Shape){
            rectangle.getParams();
//            rectangle.move1();
//            rectangle.getParams();
        } else {
            System.out.println("Это не объект фигуры!");
        }
        System.out.println();
    }
}
