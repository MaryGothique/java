import java.util.Scanner;
/*
Checked Exceptions: Eccezioni che il compilatore verifica. Devono essere gestite, altrimenti il programma non compila. Esempi: IOException, SQLException.
Unchecked Exceptions: Eccezioni che non sono controllate dal compilatore. Derivano da errori di programmazione. Esempi: NullPointerException, ArrayIndexOutOfBoundsException.
* Spiegazione del Codice

    Scanner: Utilizzato per leggere l'input dell'utente.
    Blocco try: Contiene il codice che potrebbe generare un'eccezione, come nextInt(), che genera un'eccezione se l'input non è un numero intero.
    Blocco catch: Cattura l'eccezione e stampa un messaggio d'errore.
    Blocco finally: Esegue sempre, chiudendo lo scanner per liberare risorse.
* */
public class GestioneEccezioni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
// questa cosa funziona anche con 'i numeri "non validi" ' tutti i numeri sono validi a meno che non ci metti delle lettere
        while (true) {
            try {
                System.out.print("Inserisci un numero: ");
                numero = Integer.parseInt(scanner.nextLine());
                break; // Uscita dal ciclo se l'input è valido
            } catch (NumberFormatException e) {
                System.out.println("Errore: Devi inserire un numero valido. Riprova.");
            }
        }

        System.out.println("Hai inserito il numero: " + numero);
        scanner.close();
    }
}
