public class Rivista extends Libro {
    // Proprietà
    private String dataDiPubblicazione;

    // Costruttore
    public Rivista(String titolo, String autore, String dataDiPubblicazione) {
        super(titolo, autore, 0); // Passa 0 come anno di pubblicazione
        this.dataDiPubblicazione = dataDiPubblicazione;
    }

    // Getter per la data di pubblicazione
    public String getDataDiPubblicazione() {
        return dataDiPubblicazione;
    }

    // Setter per la data di pubblicazione
    public void setDataDiPubblicazione(String dataDiPubblicazione) {
        this.dataDiPubblicazione = dataDiPubblicazione;
    }

    // Metodo per visualizzare le informazioni della rivista
    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Mostra le info del libro
        System.out.println("Data di Pubblicazione: " + dataDiPubblicazione);
    }
}
