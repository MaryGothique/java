public class Metodo {
    // Metodo per calcolare la somma
    // Method to calculate the sum
    public static int somma(int a, int b) {
        return a + b;
    }

    // Metodo ricorsivo per calcolare il fattoriale
    // Recursive method to calculate the factorial
    public static int calcolaFattoriale(int n) {
        if (n == 0) {
            return 1; // Caso base
            // Base case
        } else {
            return n * calcolaFattoriale(n - 1); // Chiamata ricorsiva
            // Recursive call
        }
    }

    public static void main(String[] args) {
        // Calcolo della somma
        // Calculation of the sum
        int sommaRisultato = somma(5, 10);
        System.out.println("La somma è: " + sommaRisultato);

        // Calcolo del fattoriale
        // Calculation of the factorial
        int numero = 5;
        int fattorialeRisultato = calcolaFattoriale(numero);
        System.out.println("Il fattoriale di " + numero + " è: " + fattorialeRisultato);
    }
}
