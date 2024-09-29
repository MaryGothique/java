public class Dipendente {
    String nome; // Employee's name
    String posizione; // Employee's position

    // Constructor with parameters
    // Constructeur avec paramètres
    public Dipendente(String nome, String posizione) {
        this.nome = nome; // Initialize the employee's name
        this.posizione = posizione; // Initialize the employee's position
    }

    // Method to display employee information
    // Méthode pour afficher les informations de l'employé
    public void mostraInfo() {
        System.out.println("Nome: " + nome + ", Posizione: " + posizione); // Print the employee's name and position
        // Imprimer le nom et la position de l'employé
    }
}

/**
 * Dipendente Class
 *
 * This class represents an employee with a name and a position.
 *
 * Main Features:
 *
 *     - Constructor to initialize the employee's name and position.
 *     - Method to display the employee's information.
 *
 */
