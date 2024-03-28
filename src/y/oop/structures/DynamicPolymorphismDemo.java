package y.oop.structures;

/**
 *
 */

public class DynamicPolymorphismDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();

        Animal myDog = new Dog();
        myDog.makeSound();
    }
}

class Animal {
    // Method to make a sound
    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    // Overriding the makeSound method for Dog
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}
