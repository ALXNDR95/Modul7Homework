package Modul7.Homework;

public class Main {
    public static void main(String[] args) {
        Neon fish = new Neon("Nemo");
        System.out.println("Meet this is " + fish.name + "." + " He is a representative of the fish class.");
        fish.eat();
        fish.swim();
        Sparrow bird = new Sparrow("Jack");
        System.out.println("Meet this is " + bird.name + "." + " He is a representative of the bird class.");
        bird.eat();
        bird.fly();
        bird.sleep();
        bird.speak();
        Lion lion = new Lion("Alex");
        System.out.println("Meet this is " + lion.name + "." + " He is a representative of the mammal class.");
        lion.eat();
        lion.run();
        lion.sleep();
        lion.speak();
    }
}
