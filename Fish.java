package Modul7.Homework;

public abstract class Fish extends Animal {
        Fish(String name) {
            super(name);
            this.name = name;
        }

        public void sleep() {
            System.out.println("It's always fun to watch the fish sleep.");
        }

        abstract void swim();
    }

class Neon extends Fish {
    Neon(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void swim() {
        System.out.println("Neon is a beautiful fish that swims quickly.");
    }

    @Override
    public void eat() {
        System.out.println("Neon is not a predatory fish and eats regular food.");
    }
}


