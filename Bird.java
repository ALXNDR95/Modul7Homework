package Modul7.Homework;

public abstract class Bird extends Animal implements Speakable {
        Bird(String name) {
            super(name);
            this.name = name;
        }

        public void speak(){
           System.out.println(name + " sings");
        }

        abstract void fly();
    }
class Sparrow extends Bird implements Speakable {
    Sparrow(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void fly() {
        System.out.println("The sparrow flies very fast.");
    }

    @Override
    public void eat() {
        System.out.println("The sparrow eats seeds and bread crumbs.");
    }

    @Override
    public void sleep() {
        System.out.println("Sparrow will sleep with his head under his wing.");
    }

    @Override
    public void speak() {
        super.speak();
        speak();
        System.out.println("Sparrows chirp beautifully");
    }
}
