public class Manager extends Dipendente {
    int numeroDiSottoposti;

    // Costruttore con parametri
    // Constructor with parameters
    public Manager(String nome, int numeroDiSottoposti) {
        super(nome, "Manager"); // Chiama il costruttore di Dipendente
        // Calls the constructor of Employee
        this.numeroDiSottoposti = numeroDiSottoposti;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Chiama il metodo mostraInfo di Dipendente
        // Calls the mostraInfo method of Employee
        System.out.println("Numero di sottoposti: " + numeroDiSottoposti);
    }
}
