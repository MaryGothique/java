public class Impiegato extends Dipendente {
    String progetto;

    // Costruttore con parametri
    public Impiegato(String nome, String progetto) {
        super(nome, "Impiegato"); // Chiama il costruttore di Dipendente
        this.progetto = progetto;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Chiama il metodo mostraInfo di Dipendente
        System.out.println("Progetto: " + progetto);
    }
}
