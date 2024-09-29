/*
 * The Libro class represents a book with properties such as title, author, and year of publication.
 *
 * Key Features:
 *
 *     - Properties for the title, author, and publication year of the book.
 *     - Constructor to initialize these properties.
 *     - Getters and setters for each property to allow for encapsulation.
 *     - Method to display book information.
 */
public class Libro {
    // Properties
    private String titolo;
    private String autore;
    private int annoPubblicazione;

    // Constructor
    public Libro(String titolo, String autore, int annoPubblicazione) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
    }

    // Getter for the title
    public String getTitolo() {
        return titolo;
    }

    // Setter for the title
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    // Getter for the author
    public String getAutore() {
        return autore;
    }

    // Setter for the author
    public void setAutore(String autore) {
        this.autore = autore;
    }

    // Getter for the year of publication
    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    // Setter for the year of publication
    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    // Method to display book information
    public void mostraInfo() {
        System.out.println("Title: " + titolo);
        System.out.println("Author: " + autore);
        System.out.println("Year of Publication: " + annoPubblicazione);
    }
}
