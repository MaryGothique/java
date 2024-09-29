import java.util.ArrayList;
import java.util.Scanner;

public class EsempioArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input

        // Declaration and initialization of an array of integers
        int[] numeri = {10, 20, 30, 40, 50};

        // Accessing array elements
        System.out.println("First number: " + numeri[0]); // Output: 10
        System.out.println("Second number: " + numeri[1]); // Output: 20

        // Modifying an element
        numeri[2] = 35; // Change the third element to 35
        System.out.println("Modified third number: " + numeri[2]); // Output: 35

        // Length of the array
        System.out.println("Length of the array: " + numeri.length); // Output: 5

        // Example with an array of doubles
        double[] number = {33.55, 26.07, 55.96, 80.88};
        System.out.println("Example with double numbers:");
        System.out.println("First number: " + number[0]);
        System.out.println("Second number: " + number[1]);
        System.out.println("Length of the double array: " + number.length);

        // Creation of an ArrayList of strings
        ArrayList<String> nomi = new ArrayList<>();

        // Adding elements to the ArrayList
        nomi.add("Mario");
        nomi.add("Luigi");
        nomi.add("Peach");

        // Accessing and printing the elements of the ArrayList
        System.out.println("\nElements of the ArrayList:");
        for (String nome : nomi) {
            System.out.println(nome);
        }

        // Modifying an element in the ArrayList
        nomi.set(1, "Wario");
        System.out.println("\nArrayList after modification:");
        for (String nome : nomi) {
            System.out.println(nome);
        }

        // Managing the friends list
        ArrayList<String> amici = new ArrayList<>();
        int scelta; // User choice

        do {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Add a friend");
            System.out.println("2. Remove a friend");
            System.out.println("3. View friends list");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            scelta = scanner.nextInt(); // Read user choice
            scanner.nextLine(); // Consume the newline left in the buffer

            switch (scelta) {
                case 1:
                    System.out.print("Enter the name of the friend to add: ");
                    String amicoDaAggiungere = scanner.nextLine(); // Read friend's name to add
                    amici.add(amicoDaAggiungere); // Add friend to the list
                    System.out.println(amicoDaAggiungere + " has been added to the list.");
                    break;
                case 2:
                    System.out.print("Enter the name of the friend to remove: ");
                    String amicoDaRimuovere = scanner.nextLine(); // Read friend's name to remove
                    if (amici.remove(amicoDaRimuovere)) {
                        System.out.println(amicoDaRimuovere + " has been removed from the list.");
                    } else {
                        System.out.println(amicoDaRimuovere + " is not in the list.");
                    }
                    break;
                case 3:
                    System.out.println("Friends list:");
                    if (amici.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        for (String amico : amici) {
                            System.out.println(amico); // Print each friend's name
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (scelta != 4);

        scanner.close(); // Close the scanner at the end
    }
}

/**
 * EsempioArray Class
 *
 * This class demonstrates the use of arrays and ArrayLists in Java.
 *
 * Main Features:
 *
 *     - Creation and manipulation of integer and double arrays.
 *     - Creation and modification of an ArrayList of strings.
 *     - A simple menu-driven interface for managing a friends list.
 */
