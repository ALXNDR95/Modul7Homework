package Modul7.Homework;

public class Sparrow extends Bird{

  //  private String name;

    Sparrow(String name) {
        super(name);
        this.name = name;
    }

    void fly() {
        System.out.println("The sparrow flies very fast.");
    }


    public void eat() {
        System.out.println("The sparrow eats seeds and bread crumbs.");
    }


    public void sleep() {

        System.out.println("Sparrow will sleep with his head under his wing.");
    }


    public void speak() {
        System.out.println("Sparrows chirp beautifully");
    }
}

