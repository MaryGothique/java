public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");

        // Creating objects of various classes
        Auto miaAuto = new Auto("Toyota", "Corolla", 2020);
        Libro mioLibro = new Libro("Uno Nessuno centomila", "Pirandello", 1926);
        Rivista miaRivista = new Rivista("Di più tv", "Paolo Fox", "16/07/1988");
        Giornale mioGiornale = new Giornale("Il Mattino", "Gianpiero Galeazzi", "25/08/2024");
        Manager mioManager = new Manager("Alice", 5);
        Impiegato mioImpiegato = new Impiegato("Bob", "Progetto A");
        Animale mioCane = new Cane("Fido");
        Animale mioGatto = new Gatto("Whiskers");

        // Calling the methods to show the information
        miaAuto.mostraInfo();
        mioLibro.mostraInfo();
        miaRivista.mostraInfo();
        mioGiornale.mostraInfo();
        mioManager.mostraInfo();
        mioImpiegato.mostraInfo();
        mioCane.faiVerso();
        mioGatto.faiVerso();

        // Modifying the title of the book and the author of the magazine
        mioLibro.setTitolo("Uno Nessuno Centomila - Edizione Speciale");
        miaRivista.setAutore("Nuovo Autore");
        mioGiornale.setAutore("Alfonso Signorini");

        // Display the updated information
        System.out.println("\nAfter the modification:");
        mioLibro.mostraInfo();
        miaRivista.mostraInfo();
        mioGiornale.mostraInfo();

        // Using the getter to obtain the title
        String titolo = mioLibro.getTitolo();
        System.out.println("The title of the book is: " + titolo);

        // Using the getter to obtain the author
        String autore = mioLibro.getAutore();
        System.out.println("The new author is: " + autore);

        // Demonstrating polymorphism by using a superclass reference
        Animale[] animali = {mioCane, mioGatto};
        System.out.println("\nAnimal sounds:");
        for (Animale animale : animali) {
            animale.faiVerso(); // Calls the overridden method in each subclass
        }
    }
}
