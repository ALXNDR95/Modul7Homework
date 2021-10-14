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



