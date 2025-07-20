class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Animal reference but Dog object
        myAnimal.makeSound(); // Calls Dog's makeSound()
    }
}
