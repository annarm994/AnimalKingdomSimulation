package test;

import main.*;

public class TestCases {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 5);
        Cat cat = new Cat("Luna", 3);
        Bird bird = new Bird("Robin", 1);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

        Dog edgeDog = new Dog("", 0);
        edgeDog.displayInfo();
        edgeDog.makeSound();

        Bird oldBird = new Bird("Ancient Bird", 100);
        oldBird.fly();
    }
}
