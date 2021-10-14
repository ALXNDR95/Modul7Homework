package Modul7.Homework;

public class Lion extends Mammal{
    Lion(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Lions are carnivores and eat meat.");
    }

    @Override
    void run() {
        System.out.println("The lion is the fastest cat.");
    }



    @Override
    public void sleep() {
        System.out.println("Lions sleep most of the day.");
    }


    @Override
    public void speak() {
        System.out.println("Lions roar menacingly.");
    }
}


