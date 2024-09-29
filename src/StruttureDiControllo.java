import java.util.Scanner; // Import the Scanner class for user input

public class StruttureDiControllo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their weight in kilograms
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble(); // Read the weight as a double

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height (in cm): ");
        double heightCm = scanner.nextDouble(); // Read the height as a double

        // Convert the height from centimeters to meters
        double height = heightCm / 100;

        // Calculate the Body Mass Index (BMI) using the formula: BMI = weight / (height * height)
        double BMI = weight / (height * height);

        // Print the calculated BMI with two decimal places
        System.out.printf("Your BMI is: %.2f%n", BMI);

        // Determine and display the BMI category based on the calculated BMI
        if (BMI < 18.5) {
            System.out.println("You are underweight.");
        } else if (BMI < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (BMI < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        // Example of using a switch statement
        // Prompt the user to enter a number corresponding to a month of the year
        System.out.print("Enter a number from 1 to 12 for the month of the year: ");
        int month = scanner.nextInt(); // Read the month as an integer

        // Use a switch statement to determine the month name based on the input
        switch (month) {
            case 1:
                System.out.println("January");
                break; // Exit the switch case
            case 2:
                System.out.println("February");
                break; // Exit the switch case
            case 3:
                System.out.println("March");
                break; // Exit the switch case
            case 4:
                System.out.println("April");
                break; // Exit the switch case
            case 5:
                System.out.println("May");
                break; // Exit the switch case
            case 6:
                System.out.println("June");
                break; // Exit the switch case
            case 7:
                System.out.println("July");
                break; // Exit the switch case
            case 8:
                System.out.println("August");
                break; // Exit the switch case
            case 9:
                System.out.println("September");
                break; // Exit the switch case
            case 10:
                System.out.println("October");
                break; // Exit the switch case
            case 11:
                System.out.println("November");
                break; // Exit the switch case
            case 12:
                System.out.println("December");
                break; // Exit the switch case
            default:
                // If the number is not between 1 and 12, print an error message
                System.out.println("Invalid number!");
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
/**
 * Explanation of the Code
 *
 *     Import Statement: The import java.util.Scanner; line allows the program to use the Scanner class for reading user input.
 *     Main Class and Method: The program is defined within a class called StruttureDiControllo, and the main method is the starting point of execution.
 *     Creating a Scanner Object: The Scanner scanner = new Scanner(System.in); line creates a Scanner object to read input from the console.
 *     User Input: The program prompts the user for their weight and height, reading the inputs using scanner.nextDouble() and scanner.nextInt().
 *     BMI Calculation: The program calculates the BMI using the formula and displays the result.
 *     BMI Evaluation: Conditional statements (if, else if, and else) categorize the BMI into underweight, normal weight, overweight, or obese.
 *     Month Selection with Switch Statement: The program prompts for a number representing a month and uses a switch statement to print the corresponding month name.
 *     Resource Management: Finally, the scanner.close(); line closes the scanner to prevent resource leaks.
 */
