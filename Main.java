package Modul7.Homework;

public class Main {
    public static void main(String[] args) {
        Neon fish = new Neon("Nemo");
        System.out.println(fish.name);
        fish.eat();
        fish.swim();
        Sparrow bird = new Sparrow("Jack");
        System.out.println(bird.name);
        bird.eat();
        bird.fly();
        bird.sleep();
        bird.speak();
        Lion mammal = new Lion("Alex");
        System.out.println(mammal.name);
        mammal.eat();
        mammal.run();
        mammal.sleep();
        mammal.speak();
    }
}
