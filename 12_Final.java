// Final keyword can be used to declare constants, methods, and classes in Java.
// A final class cannot be extended(inheritance), a final method cannot be overridden(method/function), and a final variable cannot be changed.
// The final keyword is used to restrict the user from changing the value of a variable, method, or class.
public class Final {

    public static void main(String[] args) {
        final int x = 10;
        // x = 20; // This will cause a compilation error
        System.out.println(x);
    }
}
