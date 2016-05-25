package ru.dvfu.mrcpk.ex10inheritance;

public class Rectangle extends Shape implements Movable {


    private int a, b;

    Rectangle(){ }

    Rectangle(int a, int b, int x, int y) {
        super(x, y);
        this.a=a;
        this.b=b;
        System.out.println("Создан прямоугольник в точке (" + x + "," + y + "), со сторонами:");
        System.out.print("а = " + a);
        System.out.println(", b = " + b);
    }

    Rectangle(int a, int b) {
        this.a=a;
        this.b=b;
        System.out.println("Создан прямоугольник в точке (" + x + "," + y + "), со сторонами:");
        System.out.print("а = " + a);
        System.out.println(", b = " + b);
    }

    public int getA(){
        return this.a;
    }

    public int getB(){
        return this.b;
    }

    @Override
    void draw() {
        System.out.println("Рисуем квадрат:");
        System.out.println("Опорная точка (x = " + x + ", y = " + y + ");");
        System.out.println("Стороны: a = " + a + ", b = " + b + ";");

    }

    @Override
    void getParams() {
        if(x == y)
            System.out.println("Квадрат:");
        else
            System.out.println("Прямоугольник");

        System.out.println("Опорная точка (x = " + x + ", y = " + y + ");");
        System.out.println("Стороны: a = " + a + ", b = " + b + ";");
    }

    @Override
    void setParams(int x, int y) {
        super.x = x;
        super.y = y;
        this.a=a;
        this.b=b;
    }

    @Override
    public void move1() {
        super.x+=1;
        super.y+=1;
    }
}
