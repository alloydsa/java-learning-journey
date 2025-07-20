class Student {
    String name;
    int age;
}

public class array {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int numbers[] = { 10, 20, 30, 40, 50 };

        int newNum[] = new int[5];

        // Assigning values to the new array
        newNum[0] = 1;
        newNum[1] = 2;
        System.out.println("New array elements:");
        for (int i = 0; i < newNum.length; i++) {
            System.out.print(newNum[i] + " ");
        }

        // Accessing elements in the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Looping through the array using a for loop
        System.out.print("All elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Looping through the array using an enhanced for loop
        System.out.print("All elements (enhanced for loop): ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int num2Darry[][] = new int[3][3];
        // Initializing a 2D array
        num2Darry[0][0] = 1;
        for (int i = 0; i < num2Darry.length; i++) {
            for (int j = 0; j < num2Darry[i].length; j++) {
                num2Darry[i][j] = (int) (Math.random() * 100); // Assigning random values
            }
        }

        // Displaying the 2D array
        System.out.println("2D Array elements:");
        for (int i = 0; i < num2Darry.length; i++) {
            for (int j = 0; j < num2Darry[i].length; j++) {
                System.out.print(num2Darry[i][j] + " ");
            }
            System.out.println();
        }

        for (int num[] : num2Darry) {
            for (int j : num) {
                System.out.print(j + " ");
            }
        }

        System.out.println();
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 18;

        Student s2 = new Student();
        s2.name = "Jane";
        s2.age = 19;

        Student s3 = new Student();
        s3.name = "Jim";
        s3.age = 20;

        // array of objects student, we are creating an array which can hold student
        // references, each individual oibject is created separately
        Student students[] = new Student[3];
        students[0] = new Student();
        students[0].name = "Alice";
        students[0].age = 20;

        students[1] = new Student();
        students[1].name = "Bob";
        students[1].age = 22;

        students[2] = new Student();
        students[2].name = "Charlie";
        students[2].age = 21;

        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Age: " + student.age);
        }
    }

}
