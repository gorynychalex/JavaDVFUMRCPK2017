package ru.dvfu.mrcpk.ex02Classes;

public class Person {

    private String firstname;
    private String lastname;
    private int age;
    private boolean isMail;
    private float height;

    public static int number;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car car;

    public Person(){

    }

    Person(String firstname, String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
    }

    Person(String firstname, String lastname, int age){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
    }

    Person(String firstname, String lastname, int a, boolean isMail, float height, String abc, boolean b){
        this.firstname=firstname;
        this.lastname=lastname;
        this.isMail=isMail;

        System.out.println(abc + b);
    }

    public String getFirstname(){return firstname;}
    public String getLastname(){return lastname;};
    public int getAge(){return age;}
    public boolean getIsMail(){return isMail;};
    public float getHeight(){return height;}

    public void setFirstname(String firstname){
        this.firstname=firstname;
    }

    public void setLastname(String lastname){
        this.lastname=lastname;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void aboutObject(){
        System.out.println("Имя:" + firstname);
        System.out.println("Фамилия: " + lastname);
        System.out.println("Пол мужской: " + isMail);
        System.out.println("Возраст: " + age);
        System.out.println("Рос: " + height + " см");
    }

}
