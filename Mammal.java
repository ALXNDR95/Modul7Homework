package Modul7.Homework;

public abstract class Mammal extends Animal implements Speakable {
        Mammal(String name) {
            super(name);
            this.name = name;
        }

        abstract void run();

    }

class Lion extends Mammal implements Speakable{
    Lion(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("The lion is the fastest cat.");
    }

    @Override
    public void eat() {
        System.out.println("Lions are carnivores and eat meat.");
    }

    @Override
    public void sleep() {
        System.out.println("Lions sleep most of the day.");
    }

    @Override
    public void speak() {
        speak();
        System.out.println("Lions roar menacingly.");
    }
}


