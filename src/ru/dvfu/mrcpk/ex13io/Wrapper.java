package ru.dvfu.mrcpk.ex13io;

/**
 * Объект обертка
 */
public class Wrapper extends Car {
    private Car car;
    public Wrapper(Car car){
        super(car.getName());
        this.car = car;
    }

    // Переопределение метода
    public String getName(){
        return "This is a car " + car.getName();
    }

    public void setName(String name){
        car.setName(name);
    }

    // Создание объектов Car и Wrapper в главном потоке
    public static void main(String[] args) {
        Car car = new Car("AUDI");
        Car wrapCar = new Wrapper(car);
        System.out.println(wrapCar.getName());
    }
}

class Car{
    String name;
    int age;
    int speed;

    public Car(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
