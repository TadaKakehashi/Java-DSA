package Opps;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overriding the method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Parent class object
        myAnimal.makeSound(); // Calls Animal's method

        Animal myDog = new Dog();  // Upcasting (parent reference, child object)
        myDog.makeSound(); // Calls Dog's overridden method
    }
}
