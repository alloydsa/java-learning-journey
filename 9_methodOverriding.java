public class methodOverriding {
    public static void main(String[] args) {
        // Create an instance of the subclass
        Dog dog = new Dog();
        dog.sound(); // Calls the overridden method in Dog class

        // Create an instance of the superclass
        Animal animal = new Animal();
        animal.sound(); // Calls the method in Animal class
    }
}

// access modifiers are important in method overriding and they are public,
// protected, and private
// protected access modifier allows access to the method in the same package
// and subclasses, even if they are in different packages
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
// The Dog class overrides the sound method of the Animal class
// When we call the sound method on an instance of Dog, it executes the Dog's
// version of the method
// When we call the sound method on an instance of Animal, it executes the
// Animal's version of the method
// This is an example of method overriding in Java, where a subclass provides a
// specific implementation of a method that is already defined in its
// superclass.
// Method overriding allows a subclass to provide a specific implementation of a
// method that is already defined in its superclass, enabling polymorphism in
// Java.
