// Interfaccia Animale
interface Animale {
    void faiVerso(); // Metodo astratto che deve essere implementato dalle classi che implementano questa interfaccia
    // Abstract method that must be implemented by classes that implement this interface
    // Méthode abstraite qui doit être implémentée par les classes qui implémentent cette interface
}

/**
 * Interfacce / Interfaces
 *
 *     Java: Le interfacce possono contenere metodi astratti (senza corpo) e metodi statici e di default (con corpo). Le classi possono implementare più interfacce.
 *     PHP: Les interfaces définissent également des méthodes que les classes doivent implémenter, ma ne peuvent pas avoir d'implémentations de méthodes (jusqu'à PHP 8, qui a introduit des méthodes par défaut).
 *     Java: Interfaces can contain abstract methods (without body) and static and default methods (with body). Classes can implement multiple interfaces.
 *
 * Classi Astratte / Classes Abstraites / Abstract Classes
 *
 *     Java: Una classe astratta può avere sia metodi astratti che metodi concreti. Non può essere istanziata direttamente.
 *     PHP: Également en PHP, une classe abstraite peut contenir à la fois des méthodes abstraites et concrètes et ne peut pas être instanciée.
 *     Java: An abstract class can have both abstract and concrete methods. It cannot be instantiated directly.
 *
 * Ereditarietà / Héritage / Inheritance
 *
 *     Java: Supporta l'ereditarietà singola (una classe può estendere solo una classe base).
 *     PHP: Supporte également l'héritage simple comme Java, mais permet l'implémentation de plusieurs interfaces.
 *     Java: Supports single inheritance (a class can extend only one base class).
 *
 * Esempio di Uso / Exemple d'utilisation / Example Usage
 *
 * In entrambi i linguaggi, puoi utilizzare interfacce e classi astratte per definire contratti e comportamenti comuni per diverse classi.
 * In les deux langages, vous pouvez utiliser des interfaces et des classes abstraites pour définir des contrats et des comportements communs pour différentes classes.
 * In both languages, you can use interfaces and abstract classes to define contracts and common behaviors for different classes.
 */

// Classe Cane che implementa l'interfaccia Animale
// Dog class implementing the Animal interface
// Classe Chien qui implémente l'interface Animale
class Cane implements Animale {
    private String nome; // Nome del cane / Dog's name / Nom du chien

    // Costruttore per inizializzare il nome del cane
    // Constructor to initialize the dog's name
    // Constructeur pour initialiser le nom du chien
    public Cane(String nome) {
        this.nome = nome;
    }

    @Override
    public void faiVerso() {
        // Il cane dice "Miao!" / The dog says "Miao!" / Le chien dit "Miao!"
        System.out.println(nome + " dice: Miao!");
    }
}

// Classe Gatto che implementa l'interfaccia Animale
// Cat class implementing the Animal interface
// Classe Chat qui implémente l'interface Animale
class Gatto implements Animale {
    private String nome; // Nome del gatto / Cat's name / Nom du chat

    // Costruttore per inizializzare il nome del gatto
    // Constructor to initialize the cat's name
    // Constructeur pour initialiser le nom du chat
    public Gatto(String nome) {
        this.nome = nome;
    }

    @Override
    public void faiVerso() {
        // Il gatto dice "Bau!" / The cat says "Bau!" / Le chat dit "Bau!"
        System.out.println(nome + " dice: Bau!");
    }
}
