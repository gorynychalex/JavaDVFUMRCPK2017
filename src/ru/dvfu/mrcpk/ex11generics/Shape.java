package ru.dvfu.mrcpk.ex11generics;

public abstract class Shape<T extends Number> {
    T x, y;

    Shape(){}

    public Shape(T x, T y){
        this.x=x;
        this.y=y;
    }

    abstract void draw();
    abstract<T> void getParams();
}
