package main;

import java.util.ArrayList;

public class AnimalKingdom {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Tweety", 1);
        Fish fish = new Fish("Goldie", 1);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(bird);
        animals.add(fish);

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.eat();
            animal.sleep();
            animal.makeSound();

            if (animal instanceof Dog) {
                ((Dog) animal).bark();
            } else if (animal instanceof Cat) {
                ((Cat) animal).purr();
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly();
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim();
            }
            System.out.println();
        }
    }
}
