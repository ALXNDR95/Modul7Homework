package Modul7.Homework;

public class Neon extends Fish {
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


