import java.util.Scanner; // Import the Scanner class for reading input from the console
// import de la classe Scanner pour lire l'input dans la console

public class Calcolatrice {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        // Créer un object Scanner pour lire l'input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the first number
        // Demander à l'utilisateur de saisir le premier numéro
        System.out.print("Inserisci il primo numero: ");
        double primoNumero = scanner.nextDouble(); // Read the first number
        // Lire le premier numéro
        System.out.println("Hai inserito il: " + primoNumero); // Print the first number
        // Imprimer le premier numéro

        // Ask the user to enter the second number
        // Demander à l'utilisateur de saisir le deuxième numéro
        System.out.print("Inserisci il secondo numero: ");
        double secondoNumero = scanner.nextDouble(); // Read the second number
        // Lire le deuxième numéro
        System.out.println("Hai inserito il: " + secondoNumero); // Print the second number
        // Imprimer le deuxième numéro

        // Calculate sum, difference, product, and quotient
        double somma = primoNumero + secondoNumero;
        double differenza = primoNumero - secondoNumero;
        double prodotto = primoNumero * secondoNumero;
        double quoziente = primoNumero / secondoNumero;

        // Print the results
        System.out.println("Somma: " + somma);
        System.out.println("Differenza: " + differenza);
        System.out.println("Prodotto: " + prodotto);
        System.out.println("Quoziente: " + quoziente);

        // Calculate the average
        double media = (primoNumero + secondoNumero) / 2; // Corrected to ensure the average calculation is correct
        // Print the average
        System.out.println("Media: " + media);

        // Close the scanner
        scanner.close();
    }
}

/**
 * Calcolatrice Class
 *
 * This class represents a simple calculator that reads two numbers from the user,
 * performs basic arithmetic operations (sum, difference, product, quotient),
 * and calculates the average.
 *
 * Main Features:
 *
 *     - Reads two numbers from the user.
 *     - Calculates and displays the sum, difference, product, quotient, and average.
 *
 */
