class A { // This is the superclass

    A() {
        System.out.println("A's constructor called");
    }

    A(int x) {
        this(); // calls self's default constructor
        // super(); // Calls A's default constructor, super means call the constructor
        // of
        // // object class
        System.out.println("A's parameterized constructor called with value: " + x);
    }
}
// every class in Java has a superclass, if not explicitly defined, it is Object
// class, so we can pass super inside the constructor of A

// every constructor in Java has an implicit call to the superclass constructor
class B extends A { // This is the subclass that extends A

    B() {
        System.out.println("B's constructor called");
    }

    B(int x) {

        super(x); // Calls A's parameterized constructor, super means call the constructor of
                  // super class
        System.out.println("B's parameterized constructor called with value: " + x);
    }
}

public class superThis {

    public static void main(String[] args) {
        B b = new B(10); // This will call A's constructor first, then B's constructor
        System.out.println(b);

    }

}
