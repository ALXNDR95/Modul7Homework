package Modul7.Homework;

public abstract class Fish extends Animal {
        Fish(String name) {
            super(name);
            this.name = name;
        }

        public abstract void sleep();


        abstract void swim();
    }



