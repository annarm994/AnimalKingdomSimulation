package main;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp!");
    }

    public void fly() {
        System.out.println(name + " is flying high in the sky.");
    }
}
