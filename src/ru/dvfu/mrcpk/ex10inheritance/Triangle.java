package ru.dvfu.mrcpk.ex10inheritance;

public class Triangle extends Shape{

    int a, b, c;

    Triangle(final int a, final int b, final int c, final int x, final int y){
        super(x,y);
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Создан треугольник в точке (" + x + "," + y + "со сторонами:");
        System.out.print("а = " + a);
        System.out.print("b = " + b);
        System.out.println("c = " + c);
    }

    Triangle(final int a, final int b, final int c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Создан треугольник в точке (" + x + "," + y + "), со сторонами:");
        System.out.print(" а = " + a);
        System.out.print(" b = " + b);
        System.out.println(" c = " + c);
    }

    @Override
    void draw() {

    }

    @Override
    void getParams() {
        System.out.println();
    }

    @Override
    void setParams(int x, int y) {

    }
}
