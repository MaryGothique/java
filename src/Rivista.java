public class Rivista extends Libro {
    // Proprietà
    // Properties
    private String dataDiPubblicazione;

    // Costruttore
    // Constructor
    public Rivista(String titolo, String autore, String dataDiPubblicazione) {
        super(titolo, autore, 0); // Passa 0 come anno di pubblicazione
        // Passes 0 as the publication year
        this.dataDiPubblicazione = dataDiPubblicazione;
    }

    // Getter per la data di pubblicazione
    // Getter for the publication date
    public String getDataDiPubblicazione() {
        return dataDiPubblicazione;
    }

    // Setter per la data di pubblicazione
    // Setter for the publication date
    public void setDataDiPubblicazione(String dataDiPubblicazione) {
        this.dataDiPubblicazione = dataDiPubblicazione;
    }

    // Metodo per visualizzare le informazioni della rivista
    // Method to display magazine information
    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Mostra le info del libro
        // Shows the book information
        System.out.println("Data di Pubblicazione: " + dataDiPubblicazione);
    }
}

