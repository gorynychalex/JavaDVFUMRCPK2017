package ru.dvfu.mrcpk.ex10inheritance;

public class GeometryDraw {
    public static void main(String[] args) {

//        Rectangle rectangle = new Rectangle();

        Rectangle rectangle = new Rectangle(10,10,100,100);
        if(rectangle instanceof Shape){
            rectangle.getParams();
//            rectangle.move1();
//            rectangle.getParams();
        } else {
            System.out.println("Это не объект фигуры!");
        }

        System.out.println();


        Shape triangle = new Triangle(10,10,10);

    }
}
