/*
 * The Impiegato class represents an employee who is assigned to a specific project.
 *
 * Key Features:
 *
 *     - Inherits from the Dipendente class, which means it has access to its properties and methods.
 *     - The constructor takes a name and a project as parameters and calls the constructor of the
 *       superclass (Dipendente) to initialize the employee's name and type.
 *     - The mostraInfo() method is overridden to include project details when displaying employee
 *       information.
 */
public class Impiegato extends Dipendente {
    String progetto;

    // Constructor with parameters
    public Impiegato(String nome, String progetto) {
        super(nome, "Impiegato"); // Calls the constructor of Dipendente
        this.progetto = progetto;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Calls the mostraInfo method from Dipendente
        System.out.println("Progetto: " + progetto);
    }
}

