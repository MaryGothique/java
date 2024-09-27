import java.util.Scanner;

public class StruttureDiControllo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente il peso
        System.out.print("Inserisci il tuo peso (in kg): ");
        double peso = scanner.nextDouble();

        // Chiedi all'utente l'altezza in cm
        System.out.print("Inserisci la tua altezza (in cm): ");
        double altezzaCm = scanner.nextDouble();

        // Converti l'altezza in metri
        double altezza = altezzaCm / 100;

        // Calcola il BMI
        double BMI = peso / (altezza * altezza);

        // Stampa il valore del BMI
        System.out.printf("Il tuo BMI è: %.2f%n", BMI);

        // Verifica il BMI
        if (BMI < 18.5) {
            System.out.println("Sei sottopeso.");
        } else if (BMI < 24.9) {
            System.out.println("Hai un peso normale.");
        } else if (BMI < 29.9) {
            System.out.println("Sei in sovrappeso.");
        } else {
            System.out.println("Sei obeso.");
        }

        // Esempio di switch
        System.out.print("Inserisci un numero da 1 a 12 per il mese dell'anno: ");
        int mese = scanner.nextInt();

        switch (mese) {
            case 1:
                System.out.println("Gennaio");
                break;
            case 2:
                System.out.println("Febbraio");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Aprile");
                break;
            case 5:
                System.out.println("Maggio");
                break;
            case 6:
                System.out.println("Giugno");
                break;
            case 7:
                System.out.println("Luglio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Settembre");
                break;
            case 10:
                System.out.println("Ottobre");
                break;
            case 11:
                System.out.println("Novembre");
                break;
            case 12:
                System.out.println("Dicembre");
                break;
            default:
                System.out.println("Numero non valido!");
        }

        // Chiudi lo scanner
        scanner.close();
    }
}
