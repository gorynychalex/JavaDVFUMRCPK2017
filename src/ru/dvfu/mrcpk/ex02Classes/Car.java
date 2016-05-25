package ru.dvfu.mrcpk.ex02Classes;

public class Car {
    private String name;
    private String type;
    private String color;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Car(){
    }

    public Car(String name, String type){
        this.name=name;
        this.type=type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
