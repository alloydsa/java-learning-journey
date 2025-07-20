import java.util.ArrayList;

// sealed class means that the class cannot be extended by any other class.
// it can only be used as a base class for other classes that are defined within the
// same package or module.
// Sealed classes are used to restrict the inheritance of a class to a specific set of
// subclasses, which can help to improve the maintainability and readability of the code.
// subclasses can be sealed, non-sealed, or final.

// interface can be sealed and non-sealed as well.

sealed class A permits B, C { // A is a sealed class that permits B and C to extend it
    public void display() {
        System.out.println("This is class A");
    }

}

final class B extends A { // B is a subclass of A
    public void display() {
        System.out.println("This is class B");
    }
}

final class C extends A { // C is a subclass of A
    public void display() {
        System.out.println("This is class C");
    }
}

class D {

}

public class newEnhancement {
    public static void main(String[] args) {
        var obj = new ArrayList<Integer>();
        obj.add(1);
        obj.add(2);

        var i = 23; // We have to initialize the variable before using it, if we are using 'var'
        System.out.println("Value of i: " + i); // Printing the value of i

        var nums = new int[12];

    }
}
