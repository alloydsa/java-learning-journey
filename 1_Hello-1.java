class Calculator {
    int a;

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Hello {
    public static void main(String arg[]) {
        int num = 10;
        char ch = 'A';
        double d = 10.5;
        float f = 10.5f;

        int x = (int) f;

        int b = 10;
        byte i = (byte) b; // Explicitly casting int to byte
        System.out.println(d);
        System.out.println(f);
        System.out.println(x);
        System.out.println(i);
        System.out.println(++ch);
        System.out.println("Hello, World!");
        System.out.println("The value of num is: " + num);

        byte e = 10;
        byte c = 30;

        int a = e * c; // This will automatically be promoted to int
        System.out.println(a);

        int result = e >= c ? 10 : 20; // Ternary operator
        System.out.println(result);

        // if else is same as c++

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        // switch case is same as c++
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
        }

        // while loop is same as c++
        while (num > 0) {
            System.out.println(num);
            num--;
        }

        // do while loop is same as c++
        do {
            System.out.println(num);
            num--;
        } while (num > 0);

        // for loop is same as c++
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        int num1 = 2, num2 = 3;

        Calculator calc = new Calculator();
        int sum = calc.add(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
