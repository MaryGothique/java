public class Dipendente {
    String nome;
    String posizione;

    // Costruttore con parametri
    public Dipendente(String nome, String posizione) {
        this.nome = nome;
        this.posizione = posizione;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + nome + ", Posizione: " + posizione);
    }
}
