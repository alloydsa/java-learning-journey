class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class AdVancedCalc extends Calc { // Inherits from Calc class
    // This class extends Calc and adds more functionality
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}

// Java does not support multiple inheritance directly, but we can achieve it
// through interfaces.
public class inheritance {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int sum = calc.add(5, 3);
        int difference = calc.sub(5, 3);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        AdVancedCalc advCalc = new AdVancedCalc();
        int sumAdv = advCalc.add(5, 3);
        int differenceAdv = advCalc.sub(5, 3);
        int product = advCalc.mul(5, 3);
        int quotient = advCalc.div(5, 3);
        System.out.println("Advanced Sum: " + sumAdv);
        System.out.println("Advanced Difference: " + differenceAdv);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
