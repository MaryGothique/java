import java.util.Scanner; // Importa la classe Scanner per leggere input da console
                            // import of the class Scanner for reading input from the console
                            // import de la class Scanner pour lire l input dans la console

public class Calcolatrice {
    public static void main(String[] args) {
        // Crea un oggetto Scanner per leggere l'input
        // Create an object Scanner for reading l' input
        // Créer un object Scanner por lire l input
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire il primo numero
        // Ask to the yser to insert the first number
        // demander à l' utilisateur de inserer le prémier numero
        System.out.print("Inserisci il primo numero: ");
        double primoNumero = scanner.nextDouble(); // Leggi il primo numero // read the first number // lire le premier numero
        System.out.println("Hai inserito il: " + primoNumero); // Stampa il primo numero // print the firs number // lire le premier numero

        // Chiedi all'utente di inserire il secondo numero
        // Ask at the user to insert the second number
        // demander à l utilisateur de inserer le douxieme numero
        System.out.print("Inserisci il secondo numero: ");
        double secondoNumero = scanner.nextDouble(); // Leggi il secondo numero //read the second number // lire le douxiéme numero
        System.out.println("Hai inserito il: " + secondoNumero); // Stampa il secondo numero // print the second number // lire le douxieme numero

        // Calcola somma, differenza, prodotto e quoziente

        double somma = primoNumero + secondoNumero;
        double differenza = primoNumero - secondoNumero;
        double prodotto = primoNumero * secondoNumero;
        double quoziente = primoNumero / secondoNumero;

        // Stampa i risultati
        System.out.println("Somma: " + somma);
        System.out.println("Differenza: " + differenza);
        System.out.println("Prodotto: " + prodotto);
        System.out.println("Quoziente: " + quoziente);


        // Calcolare la media
        double media = primoNumero + secondoNumero /2 ;
        // Stampa la media
        System.out.println("Media: " + media);

        // Chiudi lo scanner
        scanner.close();
    }
}
