public class Giornale extends Libro {
    // Properties
    private String dataDiPubblicazione;

    // Constructor
    public Giornale(String titolo, String autore, String dataDiPubblicazione) {
        super(titolo, autore, 0); // Pass 0 as the year of publication
        this.dataDiPubblicazione = dataDiPubblicazione;
    }

    // Getter for publication date
    public String getDataDiPubblicazione() {
        return dataDiPubblicazione;
    }

    // Setter for publication date
    public void setDataDiPubblicazione(String dataDiPubblicazione) {
        this.dataDiPubblicazione = dataDiPubblicazione;
    }

    // Method to display newspaper information
    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Show the book info
        System.out.println("Publication Date: " + dataDiPubblicazione);
    }
}
/*
 * The @Override annotation indicates that the method `mostraInfo()`
 * is overriding a method with the same name and parameters from its
 * superclass `Libro`. This allows the `Giornale` class to provide
 * its specific implementation of the `mostraInfo()` method, which
 * includes displaying the additional information about the newspaper
 * publication date.
 *
 * When `mostraInfo()` is called on an instance of `Giornale`,
 * the overridden version is executed, first calling the superclass's
 * implementation to show the book information and then adding the
 * publication date specific to the newspaper.
 *
 * Using the @Override annotation is a good practice as it helps
 * catch errors during compilation if the method signature does not
 * match any method in the superclass.
 */

