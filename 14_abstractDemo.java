abstract class Car {
    public abstract void drive(); // Abstract method, no body, must be implemented by subclasses

    public void music() {
        System.out.println("Car is playing music");
    }
}

class BMW_M4 extends Car { // concrete class that extends the abstract class Car
    public void drive() {
        System.out.println("BMW M4 is starting");
    }
}

public class abstractDemo {
    public static void main(String[] args) {

        int num = 7;
        Integer newNum = new Integer(num); // Boxing: converting a primitive type to its corresponding wrapper class,
                                           // Integer is the wrapper class for int
        // Integer newNum = Integer.valueOf(num); // Another way to box
        Integer autoBoxedNum = num; // Autoboxing: Java automatically converts the primitive type to its
                                    // corresponding wrapper class, autoBoxedNum is an Integer object

        int num2 = newNum.intValue(); // Unboxing: converting a wrapper class object to its corresponding primitive
                                      // type

        // int num2 = newNum; // Autounboxing: Java automatically converts the wrapper
        // class object to its corresponding
        // primitive type, num2 is a primitive int
        System.out.println(num2);
        System.out.println(newNum);
        System.out.println(autoBoxedNum);
        // Similarly Double and Float can be used for double and float primitive types
        // respectively.

        String str = "12";

        int num3 = Integer.parseInt(str); // Parsing a string to an int
        System.out.println(num3); // Output: 12

        // abstract keyword is used to declare a class that cannot be instantiated, and
        // can only be extended by other classes
        // and a method that does not have a body, and must be implemented by the
        // subclass
        // Abstract class

        Car myCar = new BMW_M4(); // Upcasting: treating a subclass object as an instance of its superclass
        myCar.drive(); // Calls the drive method of BMW_M4
        myCar.music(); // Calls the music method from the Car class

        // abstract class can have both abstract and non-abstract methods
        // Abstract class can also have constructors, but they cannot be instantiated

        // when u r extending an abstract class, you must implement all the
        // abstract methods in the subclass, otherwise the subclass will also be
        // considered abstract and cannot be instantiated
        // If you don't want to implement all the abstract methods, you can declare the
        // subclass as abstract as well, which means it can also have abstract methods
        // and cannot be instantiated directly
    }
}
