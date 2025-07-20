import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        // int number = System.in.read(); // This will read a single byte from the input
        // stream

        // System.out.println("You entered: " + (number - 48)); // Convert byte to hex
        // string for better
        // // readability

        // BufferedReader reader = new BufferedReader(new
        // java.io.InputStreamReader(System.in));
        // System.out.print("Enter a number: ");
        // String input = ""; // Initialize input variable to store user input
        // try {
        // input = reader.readLine(); // Read a line of text from the input
        // reader.close(); // Close the BufferedReader to free resources
        // } catch (IOException e) {
        // System.out.println("An error occurred while reading input: " +
        // e.getMessage());
        // }

        // int number = Integer.parseInt(input); // Convert the input string to an
        // integer
        // System.out.println("You entered: " + number); // Print the entered number

        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter a number: "); // Prompt the user for input
        int number = scanner.nextInt(); // Read an integer from the user
        System.out.println("You entered: " + number); // Print the entered number
        scanner.close(); // Close the scanner to free resources
    }
}
