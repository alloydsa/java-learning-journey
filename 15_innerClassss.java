// inner class in java is a class defined within another class. 

class A {
    public void display() {
        System.out.println("Inside class A");
    }

    class B {
        public void show() {
            System.out.println("Inside inner class B");
        }
    }
}

public class innerClassss {
    public static void main(String[] args) {
        A a = new A();
        a.display();

        // To create an instance of the inner class B, we need an instance of the outer
        // class A
        // because inner classes can access the members of the outer class.
        // This is how we create an instance of an inner class in Java.
        A.B b = a.new B();
        b.show();
    }
}
