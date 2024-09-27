import java.util.ArrayList;
import java.util.Scanner;

public class EsempioArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dichiarazione e inizializzazione di un array di interi
        int[] numeri = {10, 20, 30, 40, 50};

        // Accesso agli elementi dell'array
        System.out.println("Primo numero: " + numeri[0]); // Output: 10
        System.out.println("Secondo numero: " + numeri[1]); // Output: 20

        // Modifica di un elemento
        numeri[2] = 35; // Cambia il terzo elemento in 35
        System.out.println("Terzo numero modificato: " + numeri[2]); // Output: 35

        // Lunghezza dell'array
        System.out.println("Lunghezza dell'array: " + numeri.length); // Output: 5

        // Esempio con un array di double
        double[] number = {33.55, 26.07, 55.96, 80.88};
        System.out.println("Esempio con i numeri double:");
        System.out.println("Primo numero: " + number[0]);
        System.out.println("Secondo numero: " + number[1]);
        System.out.println("Lunghezza dell'array di double: " + number.length);

        // Creazione di un ArrayList di stringhe
        ArrayList<String> nomi = new ArrayList<>();

        // Aggiunta di elementi all'ArrayList
        nomi.add("Mario");
        nomi.add("Luigi");
        nomi.add("Peach");

        // Accesso e stampa degli elementi dell'ArrayList
        System.out.println("\nElementi dell'ArrayList:");
        for (String nome : nomi) {
            System.out.println(nome);
        }

        // Modifica di un elemento nell'ArrayList
        nomi.set(1, "Wario");
        System.out.println("\nArrayList dopo modifica:");
        for (String nome : nomi) {
            System.out.println(nome);
        }

        // Gestione della lista di amici
        ArrayList<String> amici = new ArrayList<>();
        int scelta;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi un amico");
            System.out.println("2. Rimuovi un amico");
            System.out.println("3. Visualizza la lista di amici");
            System.out.println("4. Esci");
            System.out.print("Scegli un'opzione: ");

            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline rimasto nel buffer

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il nome dell'amico da aggiungere: ");
                    String amicoDaAggiungere = scanner.nextLine();
                    amici.add(amicoDaAggiungere);
                    System.out.println(amicoDaAggiungere + " è stato aggiunto alla lista.");
                    break;
                case 2:
                    System.out.print("Inserisci il nome dell'amico da rimuovere: ");
                    String amicoDaRimuovere = scanner.nextLine();
                    if (amici.remove(amicoDaRimuovere)) {
                        System.out.println(amicoDaRimuovere + " è stato rimosso dalla lista.");
                    } else {
                        System.out.println(amicoDaRimuovere + " non è nella lista.");
                    }
                    break;
                case 3:
                    System.out.println("Lista di amici:");
                    if (amici.isEmpty()) {
                        System.out.println("La lista è vuota.");
                    } else {
                        for (String amico : amici) {
                            System.out.println(amico);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        } while (scelta != 4);

        scanner.close(); // Chiude lo scanner alla fine
    }
}
