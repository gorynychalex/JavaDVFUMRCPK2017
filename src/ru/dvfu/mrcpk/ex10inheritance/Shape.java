package ru.dvfu.mrcpk.ex10inheritance;

public abstract class Shape {
    int x, y;

    Shape(){}

    Shape(int x, int y){
        this.x=x;
        this.y=y;
    }

    abstract void draw();
    abstract void getParams();
    abstract void setParams(int x, int y);
}
