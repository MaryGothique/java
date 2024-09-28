// Interfaccia Animale
// le interfacce, classi, sottoclassi e classi astratte, funzionano come php, lo stesso principio ma con linguaggi dif
/**
 * Interfacce
 *
 *     Java: Le interfacce possono contenere metodi astratti (senza corpo) e metodi statici e di default (con corpo). Le classi possono implementare più interfacce.
 *     PHP: Anche le interfacce definiscono metodi che le classi devono implementare, ma non possono avere implementazioni di metodi (fino a PHP 8, che ha introdotto i metodi predefiniti).
 *
 * Classi Astratte
 *
 *     Java: Una classe astratta può avere sia metodi astratti che metodi concreti. Non può essere istanziata direttamente.
 *     PHP: Anche in PHP, una classe astratta può contenere sia metodi astratti che concreti e non può essere istanziata.
 *
 * Ereditarietà
 *
 *     Java: Supporta l'ereditarietà singola (una classe può estendere solo una classe base).
 *     PHP: Supporta l'ereditarietà singola come Java, ma consente l'implementazione di più interfacce.
 *
 * Esempio di Uso
 *
 * In entrambi i linguaggi, puoi utilizzare interfacce e classi astratte per definire contratti e comportamenti comuni per diverse classi.
 */

interface Animale {
    void faiVerso();
}

// Classe Cane che implementa l'interfaccia Animale
class Cane implements Animale {
    private String nome;

    public Cane(String nome) {
        this.nome = nome;
    }

    @Override
    public void faiVerso() {
        System.out.println(nome + " dice: Miao!"); // Il cane dice "Miao!"
    }
}

// Classe Gatto che implementa l'interfaccia Animale
class Gatto implements Animale {
    private String nome;

    public Gatto(String nome) {
        this.nome = nome;
    }

    @Override
    public void faiVerso() {
        System.out.println(nome + " dice: Bau!"); // Il gatto dice "Bau!"
    }
}




