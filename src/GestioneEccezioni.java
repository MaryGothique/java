import java.util.Scanner;

/*
Checked Exceptions: Exceptions that the compiler checks. They must be handled, otherwise the program does not compile. Examples: IOException, SQLException.
Unchecked Exceptions: Exceptions that are not checked by the compiler. They arise from programming errors. Examples: NullPointerException, ArrayIndexOutOfBoundsException.

* Code Explanation

    Scanner: Used to read user input.
    Try block: Contains code that may generate an exception, such as nextInt(), which throws an exception if the input is not an integer.
    Catch block: Catches the exception and prints an error message.
    Finally block: Executes always, closing the scanner to free resources.
*/
public class GestioneEccezioni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        // This works even with 'invalid numbers'; all numbers are valid unless you input letters.
        while (true) {
            try {
                System.out.print("Inserisci un numero: ");
                numero = Integer.parseInt(scanner.nextLine());
                break; // Exit the loop if the input is valid
            } catch (NumberFormatException e) {
                System.out.println("Errore: Devi inserire un numero valido. Riprova.");
            }
        }

        System.out.println("Hai inserito il numero: " + numero);
        scanner.close();
    }
}
