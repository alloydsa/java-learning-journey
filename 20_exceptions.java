// creating your own exceptions
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class exceptions {

    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }

        int j = 0;
        try {

            j = 18 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
        // we can have multiple catch blocks to handle different exceptions
        catch (Exception e) {
            System.out.println("Caught a general Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after exception handling.");
        }

        // throwing an exception manually

        int i = 20;
        int k = 0;

        try {
            k = 18 / i;
            if (k == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after manual exception handling.");
        }
    }
}
