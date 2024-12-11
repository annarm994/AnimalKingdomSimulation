package main;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }

    public void bark() {
        System.out.println(name + " is barking loudly!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(name + " is eating dog food.");
    }
}
