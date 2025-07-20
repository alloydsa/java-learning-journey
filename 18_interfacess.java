interface Computer {
    void code();

}

// Here, we define an interface named Computer with a method code().
// Classes Laptop and Desktop implement this interface, providing their own
// versions of the code() method.

// We use Interface instead of abstract class because we want to just define a
// contract
// for the classes that implement it, without providing any implementation
// details.

// Variables in an interface are implicitly public, static, and final, and
// methods are implicitly public and abstract.

// class can implement multiple interfaces, allowing for a form of multiple
// inheritance in Java.
// class Smartphone implements Computer, Phone

// marker interface is an interface with no methods or fields, used to indicate
// that a class possesses a certain property or behavior. For example, the
// Serializable interface in Java is a marker interface that indicates that a
// class can be serialized.
class Laptop implements Computer {
    public void code() {
        System.out.println("Coding on a laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Coding on a desktop");
    }
}

public class interfacess {
    public static void main(String[] args) {

        // Upcasting: treating a subclass object as an instance of its superclass
        Computer myLaptop = new Laptop();
        myLaptop.code(); // Calls Laptop's code()

        Computer myDesktop = new Desktop();
        myDesktop.code(); // Calls Desktop's code()

    }
}
