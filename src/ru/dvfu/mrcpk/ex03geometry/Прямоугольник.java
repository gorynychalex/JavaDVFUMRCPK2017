package ru.dvfu.mrcpk.ex03geometry;

public class Прямоугольник {

    //Свойства класса
    public int a, b;

    // Конструктор класса
    public Прямоугольник(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Создан прямоугольник.");
        System.out.println("Сторона а = " + a + ", сторона b = " + b);
        if(a < 0 || b < 0)
            throw new IllegalArgumentException("Неверно заданы стороны, одна из них отрицательная");
    }

    //Метод класса замена сторон прямоугольника
    public static void swapSides(Прямоугольник rectangle){
        System.out.println("Стороны были: а = " + rectangle.a + ", b= " + rectangle.b);
        int tmp = rectangle.a;
        rectangle.a = rectangle.b;
        rectangle.b = tmp;
        System.out.println("Стороны стали: а = " + rectangle.a + ", b= " + rectangle.b);
    }


    public boolean equals(Прямоугольник r){
        if(this.a == r.a && this.b == r.b){
            return true;
        } else {
            return false;
        }
    }


    public int square(){
        System.out.println("Площадь прямоугольника со сторонами: ");
        System.out.println("а = " + a + ", b = " + b);
        return a * b;
    }

}
