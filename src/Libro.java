public class Libro {
    // Proprietà
    private String titolo;
    private String autore;
    private int annoPubblicazione;

    // Costruttore
    public Libro(String titolo, String autore, int annoPubblicazione) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
    }

    // Getter per il titolo
    public String getTitolo() {
        return titolo;
    }

    // Setter per il titolo
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    // Getter per l'autore
    public String getAutore() {
        return autore;
    }

    // Setter per l'autore
    public void setAutore(String autore) {
        this.autore = autore;
    }

    // Getter per l'anno di pubblicazione
    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    // Setter per l'anno di pubblicazione
    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    // Metodo per visualizzare le informazioni del libro
    public void mostraInfo() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore: " + autore);
        System.out.println("Anno di Pubblicazione: " + annoPubblicazione);
    }
}

