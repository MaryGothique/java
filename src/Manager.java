public class Manager extends Dipendente {
    int numeroDiSottoposti;

    // Costruttore con parametri
    public Manager(String nome, int numeroDiSottoposti) {
        super(nome, "Manager"); // Chiama il costruttore di Dipendente
        this.numeroDiSottoposti = numeroDiSottoposti;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Chiama il metodo mostraInfo di Dipendente
        System.out.println("Numero di sottoposti: " + numeroDiSottoposti);
    }
}

