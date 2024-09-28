public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");

        // Creazione di un oggetto della classe Auto
        Auto miaAuto = new Auto("Toyota", "Corolla", 2020);
        Libro mioLibro = new Libro("Uno Nessuno centomila", "Pirandello", 1926);
        Rivista miaRivista = new Rivista("Di più tv", "Paolo Fox", "16/07/1988");
        Giornale mioGiornale = new Giornale("Il Mattino", "Gianpiero Galeazzi", "25/08/2024");
        Manager mioManager = new Manager("Alice", 5);
        Impiegato mioImpiegato = new Impiegato("Bob", "Progetto A");



        // Chiamata ai metodi per mostrare le informazioni
        miaAuto.mostraInfo();
        mioLibro.mostraInfo();
        miaRivista.mostraInfo();
        mioGiornale.mostraInfo();
        mioManager.mostraInfo();
        mioImpiegato.mostraInfo();

        // Modifica il titolo del libro e dell'autore della rivista
        mioLibro.setTitolo("Uno Nessuno Centomila - Edizione Speciale");
        miaRivista.setAutore("Nuovo Autore");
        mioGiornale.setAutore("Alfonso Signorini");
        // Visualizza le informazioni aggiornate
        System.out.println("\nDopo la modifica:");
        mioLibro.mostraInfo();
        miaRivista.mostraInfo();
        mioGiornale.mostraInfo();

        // Utilizza il getter per ottenere il titolo
        String titolo = mioLibro.getTitolo();
        System.out.println("Il titolo del libro è: " + titolo);
        String autore = mioLibro.getAutore();
        System.out.println("Il nuovo autore: " + autore);
    }
}
