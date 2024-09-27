public class Metodo {
    // Metodo per calcolare la somma
    public static int somma(int a, int b) {
        return a + b;
    }
    // Metodo ricorsivo per calcolare il fattoriale
    public static int calcolaFattoriale(int n) {
        if (n == 0) {
            return 1; // Caso base
        } else {
            return n * calcolaFattoriale(n - 1); // Chiamata ricorsiva
        }
    }

    public static void main(String[] args) {
        // Calcolo della somma
        int sommaRisultato = somma(5, 10);
        System.out.println("La somma è: " + sommaRisultato);

        // Calcolo del fattoriale
        int numero = 5;
        int fattorialeRisultato = calcolaFattoriale(numero);
        System.out.println("Il fattoriale di " + numero + " è: " + fattorialeRisultato);
    }

}
