package Modul7.Homework;

public abstract class Bird extends Animal implements Speakable{
    //public String name;

    Bird(String name) {
            super(name);
            this.name = name;
        }

        public void speak(){
           System.out.println(name + " sings");
        }

        abstract void fly();

}
