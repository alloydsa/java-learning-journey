public class Demo {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.add(5, 10);
        int result2 = calculator.add(5, 10, 15);
        System.out.println("Result of add(int, int): " + result);
        System.out.println("Result of add(int, int, int): " + result2);
    }
}