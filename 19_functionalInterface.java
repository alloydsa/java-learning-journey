@FunctionalInterface
interface A {

    void show();
    // A functional interface can have only one abstract method.

}

public class functionalInterface {

    // A functional interface is an interface that contains exactly one abstract
    // method.
    // It can have multiple default or static methods, but only one abstract method.
    // Functional interfaces can be used as the assignment target for a lambda
    // expression or method reference.
    public static void main(String[] args) {//

        // this arrow is used to demonstrate the use of a functional interface
        // A lambda expression is a concise way to represent an anonymous function (a
        // function without a name).
        A obj = () -> {
            System.out.println("Inside functional interface method");
        };
        obj.show(); // Calling the method of the functional interface

    }
}
