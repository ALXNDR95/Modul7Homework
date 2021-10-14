package Modul7.Homework;

public abstract class Mammal extends Animal implements Speakable {
        Mammal(String name) {
            super(name);
            this.name = name;
        }

        abstract void run();
    }




