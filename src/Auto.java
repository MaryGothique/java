// Auto class
// This class represents a car with its attributes and methods.

public class Auto {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // You can create an instance of Auto here and call its methods
    }

    // Attributes of the Auto class
    private String marca;  // Brand of the car
    private String modello; // Model of the car
    private int anno;      // Year of manufacture

    // Constructor to initialize the attributes of the Auto class
    public Auto(String marca, String modello, int anno) {
        this.marca = marca;  // Assigning the value of brand
        this.modello = modello; // Assigning the value of model
        this.anno = anno;    // Assigning the value of year
    }

    // Method to display information about the car
    public void mostraInfo() {
        System.out.println("Marca: " + marca);   // Display car brand
        System.out.println("Modello: " + modello); // Display car model
        System.out.println("Anno: " + anno);       // Display year of manufacture
    }
}

/**
 * Auto Class
 *
 * This class represents a car with its attributes and methods.
 *
 * Attributes of the Auto class:
 *
 *     marca: Represents the brand of the car.
 *     modello: Represents the model of the car.
 *     anno: Represents the year of manufacture.
 *
 * Methods:
 *
 *     mostraInfo(): Displays information about the car.
 */
