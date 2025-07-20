class A {
    public void makeSound() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void makeSound1() {
        System.out.println("in B show");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        // Upcasting: treating a subclass object as an instance of its superclass
        A a = new A();
        a.makeSound(); // Calls A's makeSound()
        A b = new B();
        b.makeSound(); // Calls B's makeSound() due to dynamic dispatch
        A c = (A) new B(); // Explicit upcasting, though not necessary in this case
        c.makeSound(); // Calls B's makeSound() due to dynamic dispatch

        B d = (B) b; // down casting
        d.makeSound1();

    }
}
