class A {
    public void display() {
        System.out.println("Inside class A");
    }
}

class B extends A {

    @Override
    public void display() {
        System.out.println("Inside class B");
    }
}

// override for the compiler to understand that this is an annotation
// @Deprecated // This annotation indicates that the method/class is deprecated
// and should not be used.
public class annote {

    // Annotations in Java are used to provide metadata about the program.
    // They can be used to give instructions to the compiler, provide information
    // to tools, or even change the behavior of the program at runtime.

    public static void main(String[] args) {

        B objB = new B();
        objB.display();
    }
}
